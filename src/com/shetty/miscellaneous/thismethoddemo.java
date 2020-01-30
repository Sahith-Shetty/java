package com.shetty.miscellaneous;

public class thismethoddemo {

	public static void main(String[] args) {

		computer lenovo = new computer("lenovo", "tp", (byte) 16);
		System.out.println(lenovo);

	}

}

class computer {
	String manufacturer;
	String model;
	byte ram;

	public computer() {

	}

	public computer(String manufacturer, String model) {
		this.manufacturer = manufacturer;// if variable name is same.we use this to reduce confusion
		this.model = model;
	}

	public computer(String manufacturer, String model, byte ram) {
		/*
		 * instead of initializing again we can use 'this' this.manufacturer =
		 * manufacturer; this.model = model;
		 * this is called 'this method'
		 */
		this(manufacturer, model);
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "computer [manufacturer=" + manufacturer + ", model=" + model + ", ram=" + ram + "]";
	}

}
