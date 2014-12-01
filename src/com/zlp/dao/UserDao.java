package com.zlp.dao;

import com.zlp.entity.User;

public interface UserDao {
	
	// 校验登录信息
	public boolean validateLoginInfo(User user);
	
}
