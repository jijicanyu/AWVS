package com.zlp.utils;
/**
 * 字符串测试类
 * @author syou
 *
 */
public class StringUtils {

	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if (str==null || str.length() == 0) {
			return true;
		}
		return false;
	}
	
	
	
}
