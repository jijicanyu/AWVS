/**
 * 
 */
package com.zlp.utils;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author zhangliping
 * 2015年2月1日
 */
public class PropertiesUtil {
	private static final String BUNDLE_NAME = "com.zlp.utils.config";
	
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println(RESOURCE_BUNDLE.getString("aa"));
		} catch (MissingResourceException e) {
			
			System.out.println("can not found file");
		}
	}

}
