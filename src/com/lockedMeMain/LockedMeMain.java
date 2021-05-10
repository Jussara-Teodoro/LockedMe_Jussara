package com.lockedMeMain;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.operation.LockedMeOperations;


public class LockedMeMain {

	public static void main(String[] args) {
		
		welcomeScreen();
		try {
			menuDriven();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	
	}

	public static void welcomeScreen() {
		System.out.println("\n **LOCKED ME** \n");
		System.out.println("Developed by Jussara Teodoro \n");
	}

	public static void menuDriven() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		LockedMeOperations obj = new LockedMeOperations();
		int option;
		do {
		System.out.println("Select one of the options below and enter respective number: \n");
		System.out.println("\t1. Retrieve current filenames in ascending order \n");
		System.out.println("\t2. Menu for Business-level operations \n");
		System.out.println("\t3. Exit from the application \n");
		
		option=sc.nextInt();
		switch(option) {
		case 1:
			obj.showAllFiles();
			break;
		case 2:
			int ch;
		do {
			System.out.println("Select one of the options for Business level operation below and enter respective number: \n ");
			System.out.println("\t1. Add a file and its content to a directory");
			System.out.println("\t2. Delete a file from a directory");
			System.out.println("\t3. Searching a file and showing its content");
			System.out.println("\t4. Exit from menu for Business Operation Level");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				obj.addFile();
				break;
			case 2:
				obj.deleteFile();
				break;
			case 3:
				obj.searchFile();
				break;
			case 4:
				System.out.println("Exited from the Business Level operation...");
				System.out.println("---------------------------------\n");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Exiting from the application...");
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		}while(option!=3);
		


	}

}
