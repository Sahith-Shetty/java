package com.shetty.strings;

public class Stringsdemo {

	public static void main(String[] args) {
		
		String name="IBM";
		System.out.println(name);
		
		name=name+"corp";
		System.out.println(name);
		
		String myname= "sahith shetty";
		String fullname=new String("sahith shetty");
		
		System.out.println(myname==fullname);
		if(myname.equals(fullname)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("not same");
		}
	}

}
