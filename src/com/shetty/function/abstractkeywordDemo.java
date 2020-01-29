package com.shetty.function;

public class abstractkeywordDemo {
	
	String getcompanyname() {
		return "ibm coperation";
	}
	String getproject() {
		return "";
	}
	//object cannot be created for abstract class
	//details det=new details();
	
}
abstract class details{
	abstract void getpersonaldetails();
}
