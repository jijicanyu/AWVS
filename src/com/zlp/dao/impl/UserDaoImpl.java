/**
 * 
 */
package com.zlp.dao.impl;

import com.zlp.dao.UserDao;
import com.zlp.entity.User;
import com.zlp.tool.DBTool;

/**
 * @author syou
 *
 */
public class UserDaoImpl implements UserDao {

	// 校验登录信息
	public boolean validateLoginInfo(User user) {
		DBTool dbtool = new DBTool();
		// 如果用户的用户名和密码满足要求才进行验证，否则直接判断为失败。
		if (user.getUsername() != null && user.getUsername().length() > 4
				&& user.getPassword() != null && user.getPassword().length() > 4) {
			User user1 = dbtool.validate(user.getUsername());
			if (user.getPassword().equals(user1.getPassword())) {
				// 校验密码成功
				return true;
			}
		}
		// 校验失败
		return false;
	}
}
