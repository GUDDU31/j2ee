package com.learnwithguddu.mobilefactory.main;
import java.util.Scanner;
import com.learnwithguddu.mobilefactory.mobile.Mobile;
import com.learnwithguddu.mobilefactory.object.Nothing;
import com.learnwithguddu.mobilefactory.object.OnePlus11pro;
import com.learnwithguddu.mobilefactory.object.Pixel7;
import com.learnwithguddu.mobilefactory.object.SamsungS23;

public class MobileDriver {
  static Mobile mobile;
	public static void main(String[] args) {
	   try{
		   mobileFactory().order();
	   }
	   catch (NullPointerException e) {
			System.out.println("No mobile selected.");
		}
	}
private static Mobile mobileFactory() {
	System.out.println("select mobile to order");
	System.out.println("1.SamsungS23\n"+"2.Pixel7\n"+"3.OnePlus11pro\n"+"4.Nothing");
	
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	sc.close();
	
	switch (choice) {
	case 1: 
		mobile= new SamsungS23();
		return mobile;
		
	case 2: 
		mobile = new Pixel7();
		return mobile;
		
	case 3: 
		mobile=new OnePlus11pro();
		return mobile;
		
	case 4: 
		mobile= new Nothing();
		return mobile;
	
	default:
		System.out.println("invalid choice");
		return mobile;
	}
}
}
