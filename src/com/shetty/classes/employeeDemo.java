package com.shetty.classes;

import java.util.Scanner;

public class employeeDemo {
	static int pos = 0;
	static int noemp = 0;
	static int number = 0;
	static String user;
	Scanner scan = new Scanner(System.in);
	employee obj[] = new employee[20];

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		employeeDemo ed = new employeeDemo();
		ed.creation();
		while (!user.equals("exit")) {
			System.out.println("which operation do u want to perform");
			String proc = scan1.nextLine();
			switch (proc.toLowerCase()) {
			case "create":
				ed.creation();
				break;
			case "retrieve":
				ed.retrieval();
				break;
			case "update":
				ed.update();
				break;
			case "delete":
				ed.delete();
			default:
				System.out.println("invalid input");
			}

		}
	}

	void creation() {

		System.out.println("Please enter the number of employee need to be created: ");
		number = Integer.parseInt(scan.nextLine());
		for (int i = 0 + noemp; i < number + noemp; i++) {
			obj[i] = new employee();
			obj[i].setEmpid();
			obj[i].setEmpname();
			obj[i].setProjectname();
			obj[i].setDept();
		}
		noemp = noemp + number;
		for (int k = 0; k < noemp; k++) {
			System.out.println(obj[k]);
		}
		System.out.println("do u want to perform any other: ");
		user = scan.nextLine();
	}

	void retrieval() {
		System.out.println("which employee id would u want to retrieve: ");
		int input = Integer.parseInt(scan.nextLine());
		int iden = info(input);
		System.out.println(obj[iden]);
		System.out.println("do u want to perform any other: ");
		user = scan.nextLine();
	}

	void update() {
		System.out.println("which employee id would u want to update: ");
		int input = Integer.parseInt(scan.nextLine());
		int iden = info(input);
		System.out.println("which feild u want to update: ");
		String valup = scan.nextLine();
		switch (valup.toLowerCase()) {
		case "id":
			obj[iden].setEmpid();
			break;
		case "name":
			obj[iden].setEmpname();
			break;
		case "dept":
			obj[iden].setDept();
			break;
		case "project":
			obj[iden].setProjectname();
		default:
			System.out.println("invalid input");
		}
		System.out.println(obj[iden]);
		System.out.println("do u want to perform any other: ");
		user = scan.nextLine();
	}

	void delete() {
		System.out.println("which employee id of whom u want to delete: ");
		int input = Integer.parseInt(scan.nextLine());
		int iden = info(input);
		obj[iden] = null;
		for (int k = 0; k < noemp; k++) {
			System.out.println(obj[k]);
		}
		System.out.println("do u want to perform any other: ");
		user = scan.nextLine();
	}

	int info(int input) {
		for (int i = 0; i < noemp; i++) {
			int temp = obj[i].getEmpid();
			if (temp == input) {
				pos = i;
			}
		}
		return pos;
	}
}