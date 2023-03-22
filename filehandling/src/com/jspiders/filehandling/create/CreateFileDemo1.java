package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo1 {

	public static void main(String[] args) {
		File file=new File("Hello.txt");
		if(file.exists()) {
			System.out.println("file already exist.");
		}
		else
        {
			try {
				file.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				System.out.println("file not created");
				e.printStackTrace();
				
			}
		}

	}

}
