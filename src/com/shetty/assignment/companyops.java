package com.shetty.assignment;

import java.util.HashMap;
import java.util.Scanner;

public class companyops {
	static int number;
	static int noemp;
	static int pos;
	Scanner scan = new Scanner(System.in);

	public void creation(HashMap<Integer, company> hm) {

		System.out.println("enter the company id u want to create ");
		number = Integer.parseInt(scan.nextLine());
		company obj = new company();
		obj.setComid(number);
		obj.setComname();
		obj.setLocation();
		obj.setFounder();
		hm.put(number, obj);

	}

	public void retrieval(HashMap<Integer, company> hm) {
		System.out.println("which company id would u want to retrieve: ");
		int input = Integer.parseInt(scan.nextLine());
		if (hm.containsKey(input)) {
			System.out.println(hm.get(input));
		} else {
			System.out.println("Company id incorrect or absent");
		}
	}

	public void update(HashMap<Integer, company> hm) {
		System.out.println("which company id would u want to update: ");
		int input = Integer.parseInt(scan.nextLine());
		if (hm.containsKey(input)) {
			System.out.println("which feild u want to update(name,location): ");
			String valup = scan.nextLine();
			company obj = hm.get(input);
			switch (valup.toLowerCase()) {
			case "name":
				obj.setComname();
				break;
			case "location":
				obj.setLocation();
				break;
			default:
				System.out.println("invalid input");
			}
			System.out.println(hm.get(input));
		} else {
			System.out.println("Company id incorrect or absent");
		}
	}

	public void delete(HashMap<Integer, company> hm) {
		System.out.println("which company id would u want to update: ");
		int input = Integer.parseInt(scan.nextLine());
		if (hm.containsKey(input)) {
		hm.remove(input);
		System.out.println("sucessfully deleted");
		}
		else {
			System.out.println("Company id incorrect or absent");
		}
	}

}
