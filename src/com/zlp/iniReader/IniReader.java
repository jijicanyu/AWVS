/**
 * 
 */
package com.zlp.iniReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @author zhangliping
 * 2015年1月31日
 */
public class IniReader {
	String configpath = "d://conifg.ini";
	private static Properties properties =new Properties(); 
	FileInputStream fis = null; // 读
	OutputStream fos ; 
	
	
	/**
	 * 
	 */
	public IniReader() {
		try {
			fis = new FileInputStream(configpath);
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public String getProperty(String key)
	{
		Object object = properties.get(key);
		return object.toString();
	}
	
	public void setProperty(String key, String value)
	{
		try {
			fos = new FileOutputStream(configpath);// 加载读取文件流
			properties.setProperty(key, value);
			properties.store(fos, null);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IniReader ini = new IniReader();
		System.out.println(ini.getProperty("current_selectCase"));
		ini.setProperty("reportFile", "D://aa");
		System.out.println(ini.getProperty("reportFile"));
		ini.setProperty("keyStoreFile", "C://ee");
		System.out.println(ini.getProperty("keyStoreFile"));
	}
}
