package com.shetty.miscellaneous;

public class staticblockDemo {

	public static void main(String[] args) {
		
		new check();
		//check c=new check();
		//check c1=new check();
	}

}
class check{
	//block
	{
		System.out.println("check.enclosing_method()");
	}
	//static block
	static{
		System.out.println("check.enclosing2_method()");
	}

	public check() {
		System.out.println("check.check()");
	}
	
}