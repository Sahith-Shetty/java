package com.shetty.assignment;

import java.util.HashMap;
import java.util.Scanner;
public class companymain {
	static String user="yes";
	
	
	
	public static void main(String[] args) {
		HashMap<Integer, company> hm=new HashMap<Integer, company>();
		
		Scanner scan1=new Scanner(System.in);
		companyops co=new companyops();
		while(!user.equals("exit")) {
			System.out.println("which operation do u want to perform(create,retrieve,update,delete,exit):");
			String proc = scan1.nextLine();
			switch (proc.toLowerCase()) {
			case "create":
				co.creation(hm);
				break;
			case "retrieve":
				co.retrieval(hm);
				break;
			case "update":
				co.update(hm);
				break;
			case "delete":
				co.delete(hm);
				break;
			case "exit":
				user="exit";
				break;
			default:
				System.out.println("invalid input");
			}
	}
		
	}
}


