package com.youershaicha.information.service;

import com.alibaba.fastjson.JSONObject;
import com.youershaicha.information.domain.ChildDO;

import java.util.Map;

public interface ResultService {
    Map<String,Object> saveResultData(JSONObject obj);

    Map<String,Object> getResultData(String childIdcard, Integer age);
}
