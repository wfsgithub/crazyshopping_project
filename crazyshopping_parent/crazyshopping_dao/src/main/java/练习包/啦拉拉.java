package 练习包;

import java.io.File;

public class 啦拉拉 {
 public static void main (String [] args) {
	 File file = new File("D:\\practisepackge1");
	 printFileName(file);
 } 
 	public static void printFileName(File file) {
 		File[] listFiles = file.listFiles();
 		for (File file2 : listFiles) {
			if(!file2.isFile()) {
				printFileName(file2);
			}else{
				
				
				System.out.println("ssss");
				System.out.println("文件名："+file2.getName());
			} 
		}
	}
 	
}
