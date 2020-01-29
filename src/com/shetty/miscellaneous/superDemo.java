package com.shetty.miscellaneous;

public class superDemo {

	public static void main(String[] args) {
		servicecompany sc= new servicecompany();
		sc.info();
	}
}

class company {
	public company(int value) {
		super();
		System.out.println("company.company()");
	}
	void info() {
		System.out.println("company.enclosing_method()");
	}
}

class servicecompany extends company {
	public servicecompany() {
		//if u overload the constructor u need to pass parameters to super
		super(100);
	}
	}

