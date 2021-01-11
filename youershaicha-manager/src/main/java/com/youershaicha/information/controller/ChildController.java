package com.youershaicha.information.controller;

import java.text.SimpleDateFormat;
import java.util.*;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.youershaicha.common.utils.*;
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
	@GetMapping()
	@RequiresPermissions("information:child:child")
	String Child(){
		return "information/child/child";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("information:child:child")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params);
		List<ChildDO> childList = childService.list(query);
		int total = childService.count(query);
		PageUtils pageUtils = new PageUtils(childList, total);
		return pageUtils;
	}



	/**
	 * 二维码查看
	 * @param childId
	 * @param model
	 * @return
	 */
	@GetMapping("/txcode/{childId}")
	String txcode(@PathVariable("childId") Long childId,Model model){
		ChildDO childDO = childService.get(childId);
		String identityCard = childDO.getChildIdcard();
		String code = QRCodeUtil.creatRrCode(identityCard+"JOIN"+childId, 200,200);
		model.addAttribute("code", "data:image/png;base64,"+code);
		model.addAttribute("childDO", childDO);
		return "/information/child/TxCode";
	}

	/**
	 * 批量打印二维码
	 */
	@GetMapping("/batchdayinerweima")
	public String batchdayinerweima(Long[] childIds,Model model){
		List<ChildDO> list = new ArrayList<>();
		for (Long childId : childIds) {
			ChildDO childDO = Optional.ofNullable(childService.get(childId)).orElseGet(ChildDO::new);
			String identityCard = childDO.getChildIdcard();
			String code = QRCodeUtil.creatRrCode(identityCard+"JOIN"+childId, 100,100);
			childDO.setQRCode("data:image/png;base64,"+code);
			Optional.ofNullable(childDO.getChildBirthday()).ifPresent(
				c->	childDO.setCheckString(new SimpleDateFormat("YYYY年MM月dd日").format(c))
			);
			list.add(childDO);
		}
		model.addAttribute("childDO", list);
		return "information/child/batchdayinerweima";

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
