package com.shetty.function;

public class finalclassDemo {
	public static void main(String[] args) {
		additionalinfo ai= new additionalinfo();
		ai.getinfo();
		}
	
}

final class info{
	void getinfo() {
		System.out.println("info.getinfo()");
	}
}
//final class cannot be inherited
class additionalinfo{
	void getinfo() {
		info I=new info();
		I.getinfo();
	}
	
}