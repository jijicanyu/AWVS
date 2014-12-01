package com.zlp.dwr;

import com.zlp.utils.StringUtils;

public class UserLoginDwr {

	/**
	 * 校验用户名是否符合规范
	 * @param username
	 * @return
	 */
	public String validateUsername(String username) {
		String valiateFlag = "";
		
		if (StringUtils.isEmpty(username)) {
			valiateFlag = "用户名不能为空";
		}
		if (username.length() > 20 || username.length() < 5) {
			valiateFlag = "用户名不能小于5位";
		}
		return valiateFlag;
	}
	
	/**
	 * 校验密码是否符合规范
	 * @param password
	 * @return
	 */
	public String validatePassword(String password) {
		String valiateFlag = "";
		if (StringUtils.isEmpty(password)) {
			valiateFlag = "密码不能为空";
		}
		if (password.length()>20 || password.length() < 5) {
			valiateFlag = "密码不能小于5位";
		}
		return valiateFlag;
	}
}
