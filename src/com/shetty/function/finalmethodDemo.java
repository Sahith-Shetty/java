package com.shetty.function;

public class finalmethodDemo {
	static final int value = 100;

	// final value cannot be reassigned
	public static void main(String[] args) {
		System.out.println(value);
		// value=200;
		// System.out.println("updated value: "+value);
	}

}

class data {
	void stddata() {
		System.out.println("data.stddata()");
	}

	final void spldata() {
		System.out.println("special data");
	}

}

//final function cannot be overridden
class compantdata extends data {
	@Override
	void stddata() {
		// TODO Auto-generated method stub
		super.stddata();
	}
	// @Override
	// void spldata() {
	// TODO Auto-generated method stub
	// super.spldata();
	// }
	

}
