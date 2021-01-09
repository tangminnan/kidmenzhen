package com.youershaicha.common.controller;

import org.springframework.stereotype.Controller;

import com.youershaicha.common.utils.ShiroUtils;
import com.youershaicha.owneruser.domain.OwnerUserDO;
import com.youershaicha.system.domain.UserToken;

@Controller
public class BaseController {
	public OwnerUserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getChectorId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
	/*public Long getforIds() {
		return getUser().getUserId();
	}*/
}