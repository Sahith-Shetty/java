package com.shetty.variables;

public class variablesDemo {
	//instance variable
	static int level;

	public static void main(String[] args) {
		//local variable
		int count = 10;
		System.out.println("count value: " + count);
		
		System.out.println("level value: " + level);

	}

	void calculate() {
		System.out.println("level value: "+level);
	}

}
