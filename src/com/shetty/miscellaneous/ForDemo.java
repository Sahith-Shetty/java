package com.shetty.miscellaneous;


public class ForDemo {
	public static void main(String[] args) {
		
		// traditional for
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			System.out.println(string);
		}

		System.out.println("\n-------------\n");
		
		//for each
		for (String string : args) {
			System.out.println(string);
		}
	}
}
