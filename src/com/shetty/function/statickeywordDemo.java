package com.shetty.function;

public class statickeywordDemo {

	public static void main(String[] args) {
		company ibm=new company();
		ibm.getfounder();
		//u don't need to a object to call static method
		company.getfounder();
	}

}
class company{
	static void getfounder() {
		System.out.println("thomas j watson");
	}
}