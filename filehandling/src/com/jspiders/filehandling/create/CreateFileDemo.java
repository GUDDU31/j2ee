package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

	public static void main(String[] args) {
		File file=new File("Hello.txt");
		try {
			file.createNewFile();
			System.out.println("file created");
		} catch (IOException e) {
			System.out.println("file not created");
			e.printStackTrace();
		}

	}

}
