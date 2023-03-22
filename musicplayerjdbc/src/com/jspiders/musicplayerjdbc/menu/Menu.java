package com.jspiders.musicplayerjdbc.menu;

import java.util.Scanner;

import com.jspiders.musicplayerjdbc.operation.Operation;

public class Menu {
	static int choose;
    static  Scanner scanner;
    static boolean loop=true;
    
	
	public static void main(String[] args) {
		while(loop) {
	    System.out.println("========================");
		System.out.println("1:play Song");
		
		System.out.println("2:add / remove song");
		
		System.out.println("3:Update Song");
		
		System.out.println("4:Exit");
		System.out.println("===========   ===========");
		
		System.out.println("choose the option from above");
		
		scanner=new Scanner(System.in);
		choose=scanner.nextInt();
		int ch1;
		switch (choose) {
		case 1:
			System.out.println("1:play All Song");
			System.out.println("2:choose song");
			System.out.println("3:play random song");
			System.out.println("4:go back");
			System.out.println("========= choose option from above==========");
			ch1=scanner.nextInt();
			switch (ch1) {
			case 1:
				Operation.playallsong();
				break;
			case 2:
				
				Operation.chooseSong();
				break;
			case 3:
				System.out.println("playing random song");
				Operation.playrandom();
				
			case 4:
				break;
			}
			break;
        
		case 2:
			System.out.println("1:Add Song ");
			System.out.println("2:Remove Song");
			System.out.println("3:Go back");
			System.out.println("========  ==========");
			System.out.println("choose the option from above");
			ch1=scanner.nextInt();
			switch (ch1) {
			case 1:
				Operation.add();
				break;
			case 2:
		        Operation.removesong();
			}
			break;
			
		case 3:
			
			Operation.updatesong();
			System.out.println("======== ===========");
			
			break;
		case 4:
			System.out.println("Thank You.....");
			loop =false;
			break;
			
		default:
			System.out.println("you have entered the wrong option");
			break;
		}
		}
	}

}
