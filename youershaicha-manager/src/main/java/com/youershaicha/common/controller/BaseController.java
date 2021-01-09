package com.youershaicha.common.controller;

import org.springframework.stereotype.Controller;

import com.youershaicha.common.utils.ShiroUtils;
import com.youershaicha.system.domain.UserDO;
import com.youershaicha.system.domain.UserToken;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}