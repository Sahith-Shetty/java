package com.shetty.memory;

public class stackmemoryDemo {

	public static void main(String[] args) {
		hello();
	}

	private static void hello() {
		System.out.println("stackmemoryDemo.hello()");
		hello();
	}

}
