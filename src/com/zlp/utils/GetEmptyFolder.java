package com.zlp.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author zhangliping
 * 获取电脑中 空的文件夹
 */
public class GetEmptyFolder {

	public static void main(String[] args) throws IOException {
		System.out.println("~~~~~~本程序用于获取计算机中的空文件~~~~~~");
		System.out.println("~~~~~~~~~~~~~~start~~~~~~~~~~~~~~");
		FileWriter report = new FileWriter(System.getProperty("user.dir") + File.separator + "report.txt");
		File[] file1 = File.listRoots();

		for (File filetemp : file1) {
			System.out.println("Find in：" + filetemp + " beign");
			getEmptyFolder(filetemp, report);
			System.out.println("Find in：" + filetemp + "end");
		}
		System.out.println("~~~~~~~~~~~~~~end~~~~~~~~~~~~~~");
		report.flush();
		report.close();
	}

	public static void getEmptyFolder(File file, FileWriter filewriter)
			throws IOException {
		if (file.isDirectory()) {
			File[] listFile = file.listFiles();
			if (listFile == null || listFile.length == 0) {
				System.out.println(file.getAbsolutePath());
				filewriter.write(file.getAbsolutePath());
				filewriter.write("\r\n");
			} else {
				for (int i = 0; i < listFile.length; i++) {
					if (listFile[i].isFile()) {
						continue;
					} else {
						getEmptyFolder(listFile[i], filewriter);
					}
				}

			}
		}
	}
}
