package com.shetty.function;

public abstract class calculations {

	public static int addition(int first, int last) {
		return first + last;
	}

	protected final int subtraction(int first, int last) {
		return first - last;
	}

	synchronized int multiplication(int first, int last) {
		return first * last;
	}

	private native int division(int first, int last);
	
	abstract int remaining(int first, int last);
}
