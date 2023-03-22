package com.jspiders.filehandling.info;

import java.io.File;

public class FileInfoDemo1 {

	public static void main(String[] args) {
		File file=new File("Hello.txt");
		if(file.exists()) {
			System.out.println("file name : "+file.getName());
			System.out.println("Absolute path : "+file.getAbsolutePath());
			System.out.println("file length : "+file.length());
			if(file.canRead()) {
				System.out.println("file is readable");
			}
			else {
				System.out.println("file does not readable");
			}
			if(file.canWrite()) {
				System.out.println("file is writable");
			}
			else {
				System.out.println("file does not writable");
			}
			if(file.canExecute()) {
				System.out.println("file is executable");
			}
			else {
				System.out.println("file does not executable");
			}
		}
		else {
			System.out.println("file does not exist.");
		}

	}

}
