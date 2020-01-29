package com.shetty.miscellaneous;

public class objectdemo {

	public static void main(String[] args) {

		mobile m = new mobile();
		m.gettype();
		m.scrennsize();
		m.toString();
		
		Object mob=new mobile();
		keyboard key=new mobile();
		
	}

}

class mobile extends keyboard{

	void scrennsize() {
		
	}
}
class keyboard{
	void gettype() {
		
	}
}
