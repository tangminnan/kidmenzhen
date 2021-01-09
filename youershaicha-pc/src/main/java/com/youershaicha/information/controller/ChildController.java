package com.youershaicha.information.controller;

import java.text.SimpleDateFormat;
import java.util.*;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.youershaicha.common.utils.PageUtils;
import com.youershaicha.common.utils.Query;
import com.youershaicha.common.utils.R;
import com.youershaicha.common.utils.StringUtils;
import com.youershaicha.information.dao.ChildBasicDao;
import com.youershaicha.information.domain.*;
import com.youershaicha.information.service.ChildService;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 幼儿基本信息表
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2020-12-31 16:37:34
 */
 
@Controller
@RequestMapping("/information/child")
public class ChildController {
	@Autowired
	private ChildService childService;

	

	/**
	 * 保存孩子的基本信息
	 */
	@ResponseBody
	@PostMapping("/save")
	public R save( ChildDO child){
		String childIdcard=child.getChildIdcard();
		if(StringUtils.isBlank(childIdcard)){
			return R.error("宝宝的身份证号不能为空");
		}
		ChildDO childDO = childService.getByChildIdcard(childIdcard);
		if(childDO!=null){
			child.setChildId(childDO.getChildId());
			childService.update(child);
			return R.ok(String.valueOf(child.getChildId()));
		}else {
			if (childService.save(child) > 0) {
				return R.ok(String.valueOf(child.getChildId()));
			}
		}
		return R.error();
	}

	/**
	 * 保存检查信息
	 * @param childBasicDO
	 * @return
	 */
	@PostMapping("/saveChildBasic")
	@ResponseBody
	public R saveChildBasic(ChildBasicDO childBasicDO){
		ChildDO childDO = childService.get(childBasicDO.getChildId());
		if(childDO!=null){
			childBasicDO.setChildIdcard(childDO.getChildIdcard());
		}
		childBasicDO.setCheckDate(new Date());
		if(childService.saveChildBasic(childBasicDO)>0){
			return R.ok();
		}
		else
			return R.error();
	}

	/**
	 * 获取最近一次的屈光筛查
	 * @param childIdcard
	 * @param age
	 * @return
	 */
	@GetMapping("/getChildRefractionScreening")
	@ResponseBody
	public Map<String,Object>  getChildRefractionScreening( String childIdcard,Integer age){
		Map<String,Object> resultMap = new HashMap<>();
		Map<String,Object> paramsMap = new HashMap<String,Object>();
		paramsMap.put("childIdcard",childIdcard);
		paramsMap.put("age",age);
		ChildRefractionScreeningDO childRefractionScreeningDO = childService.getRecentChildRefractionScreeningDO(paramsMap);
		if(childRefractionScreeningDO!=null){
			resultMap.put("code",0);
			resultMap.put("data",childRefractionScreeningDO);
		}else{
			resultMap.put("code",-1);
			resultMap.put("data",null);
		}

		return resultMap;
	}




	/**
	 * 获取最近一次的广域眼底照相
	 * * @param childIdcard
	 * @param age
	 * @return
	 */
	@GetMapping("/getChildChildPhotography")
	@ResponseBody
	public Map<String,Object>  getChildChildPhotography( String childIdcard,Integer age){
		Map<String,Object> resultMap = new HashMap<>();
		Map<String,Object> paramsMap = new HashMap<String,Object>();
		paramsMap.put("childIdcard",childIdcard);
		paramsMap.put("age",age);
		ChildPhotographyDO childPhotographyDO = childService.getRecentChildPhotographyDO(paramsMap);
		if(childPhotographyDO!=null){
			if(StringUtils.isNotBlank(childPhotographyDO.getPicRighteye())){
				String picRighteye = childPhotographyDO.getPicRighteye();
				childPhotographyDO.setRightList((List<String>) JSONArray.parse(picRighteye));
			}
			if(StringUtils.isNotBlank(childPhotographyDO.getPicLefteye())){
				String picLefteye = childPhotographyDO.getPicLefteye();
				childPhotographyDO.setLeftList((List<String>) JSONArray.parse(picLefteye));
			}
			resultMap.put("code",0);
			resultMap.put("data",childPhotographyDO);
		}else{
			resultMap.put("code",-1);
			resultMap.put("data",null);
		}

		return resultMap;
	}

	/**
	 * 获取最近一次的电脑验光数据
	 * @return
	 */
	@GetMapping("/getChildOptometryDO")
	@ResponseBody
	public Map<String,Object> getChildOptometryDO(String childIdcard,Integer age){
		Map  resultMap = new HashMap<String,Object>();
		Map<String,Object> paramsMap = new HashMap<String,Object>();
		Map<String,Object> pMap = new HashMap<String,Object>();
		pMap.put("childIdcard",childIdcard);
		pMap.put("age",age);
		ChildOptometryDO childOptometryDO = childService.getRecentChildOptometryDO(pMap);
		if(childOptometryDO!=null){
			List<ChildDiopterDO> childDiopterDOS = childService.getChildDiopterDOList(childOptometryDO.getTOptometryId());
			List<ChildCornealDO> childCornealDOS = childService.getChildChildCornealDOList(childOptometryDO.getTOptometryId());
			paramsMap.put("childOptometryDO",childOptometryDO);
			paramsMap.put("childDiopterDOS",childDiopterDOS);
			paramsMap.put("childCornealDOS",childCornealDOS);
			resultMap.put("code",0);
			resultMap.put("data",paramsMap);
		}else{
			resultMap.put("code",-1);
		}
		return resultMap;
	}

	/**
	 *  获取最近一次检查的眼轴长度	 */
	@GetMapping("/getChildEyeaxisDO")
	@ResponseBody
	public Map<String,Object> getChildEyeaxisDO(String childIdcard,Integer age){
		Map<String,Object> resultMNap = new HashMap<String,Object>();
		Map<String,Object> paramsMap = new HashMap<String,Object>();
		paramsMap.put("childIdcard",childIdcard);
		paramsMap.put("age",age);
		ChildEyeaxisDO childEyeaxisDO = childService.getChildEyeaxisDO(paramsMap);
		if(childEyeaxisDO!=null){
			resultMNap.put("data",childEyeaxisDO);
			resultMNap.put("code",0);
		}else{
			resultMNap.put("code",-1);
		}
		return resultMNap;
	}



	@GetMapping("/getChild")
	@ResponseBody
	public Map<String,Object> getChild(String childIdcard){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		ChildDO childDO = childService.getByChildIdcard(childIdcard);
		if(childDO!=null){
			resultMap.put("data",childDO);
			resultMap.put("code",0);
			return resultMap;
		}else{
			resultMap.put("code",-1);
			return resultMap;
		}
	}

	/**
	 * 查看历史记录
	 * * @param childIdcard
	 * @param model
	 * @return
	 */
	@GetMapping("/getHistory/{childIdcard}/{age}")
	public String getHistory(@PathVariable("childIdcard") String childIdcard,@PathVariable("age") Integer age, Model model){
		Map<String,Object> paramsMap = new HashMap<String,Object>();
		paramsMap.put("childIdcard",childIdcard);
		paramsMap.put("age",age);
		ChildDO childDO = childService.getByChildIdcard(childIdcard);//基本信息
		if(childDO==null) childDO=new ChildDO();
		ChildBasicDO childBasicDO = childService.getRecentlyBasic(paramsMap);//最近检查过的基本检查信息
		if(childBasicDO==null) {
			childBasicDO = new ChildBasicDO();
			childBasicDO.setAge(age);
		}
		else{
			childBasicDO.setCheckString(new SimpleDateFormat("yyyy年MM月dd日").format(childBasicDO.getCheckDate()));
			if(childBasicDO.getLastCheckDate()!=null){
				childBasicDO.setLastcheckString(new SimpleDateFormat("yyyy年MM月dd日").format(childBasicDO.getLastCheckDate()));
			}
		}
		ChildPhotographyDO childPhotographyDO = childService.getRecentChildPhotographyDO(paramsMap);//广域眼底照相
		if(childPhotographyDO==null) childPhotographyDO=new ChildPhotographyDO();
		else{
			if(StringUtils.isNotBlank(childPhotographyDO.getPicRighteye())){
				String picRighteye = childPhotographyDO.getPicRighteye();
				childPhotographyDO.setRightList((List<String>) JSONArray.parse(picRighteye));
			}
			if(StringUtils.isNotBlank(childPhotographyDO.getPicLefteye())){
				String picLefteye = childPhotographyDO.getPicLefteye();
				childPhotographyDO.setLeftList((List<String>) JSONArray.parse(picLefteye));
			}
		}
		ChildRefractionScreeningDO childRefractionScreeningDO = childService.getRecentChildRefractionScreeningDO(paramsMap);
		if(childRefractionScreeningDO==null) childRefractionScreeningDO = new ChildRefractionScreeningDO();
		ChildEyeaxisDO childEyeaxisDO = childService.getChildEyeaxisDO(paramsMap);
		if(childEyeaxisDO==null) childEyeaxisDO = new ChildEyeaxisDO();
		model.addAttribute("childIdcard",childIdcard);
		model.addAttribute("childDO",childDO);
		model.addAttribute("childBasicDO",childBasicDO);
		model.addAttribute("childPhotographyDO",childPhotographyDO);
		model.addAttribute("childRefractionScreeningDO",childRefractionScreeningDO);
		model.addAttribute("childEyeaxisDO",childEyeaxisDO);
		return "/information/youer/lishijilu";
	}
}
