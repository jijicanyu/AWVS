/**
 * 
 */
package com.zlp.test;
import java.io.File;

public class BatchFileRename {

	/**
	 * 将某一路径下的文件全部重命名
	 * @param absolutePath 需要重命名的路径
	 * @param baseName 基础文件
	 * @param suffix 后缀名
	 */
	
	public void FileToNewName(String absolutePath, String baseName,String suffix) {
		File file = new File(absolutePath);
		// 判断路径是否存在且是否为目录
		if (file.exists() && file.isDirectory()) {
			File[] fileList = file.listFiles();
			// 遍历目录，获取目录下文件列表
			for (int i = 0; i < fileList.length; i++) {
				File file2 = fileList[i];
				// 将其重命名成本路径下的 文件
				file2.renameTo(new File(file2.getParent()+ File.separator + baseName+ i + "." + suffix));
			}
		}
	}
	public static void main(String[] args) {
		new BatchFileRename().FileToNewName("E:\\file_Test","photo","gif");
	}
}

