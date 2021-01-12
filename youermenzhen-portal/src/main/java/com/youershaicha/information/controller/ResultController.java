package com.youershaicha.information.controller;

import com.alibaba.fastjson.JSONObject;
import com.youershaicha.common.annotation.Log;
import com.youershaicha.common.utils.R;
import com.youershaicha.common.utils.StringUtils;
import com.youershaicha.information.domain.ChildDO;
import com.youershaicha.information.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * 检查数据的录入
 * 眼轴长度 屈光筛查  电脑验光  广域眼底照相
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2020-12-31 16:37:34
 */
 
@RestController
@RequestMapping("/information/child")
public class ResultController {
	@Autowired
	private ResultService resultService;

	@Log("检查结果数据保存")
	@PostMapping("/saveResultData")
	public Map<String,Object> saveResultData(@RequestBody JSONObject obj){
		return resultService.saveResultData(obj);
	}

	@Log("获取检查结果")
	@GetMapping("/getResultData")
	public Map<String,Object> getResultData(String childIdcard,Integer age){
		return resultService.getResultData(childIdcard,age);
	}

}
