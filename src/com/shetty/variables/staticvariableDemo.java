package com.shetty.variables;

public class staticvariableDemo {
	public static void main(String[] args) {
		vendor iiht=new vendor();
		iiht.createvenders("iiht technologies");
		iiht.totalvendors();
		
		vendor hungerbox=new vendor();
		hungerbox.createvenders("hungerbox food services");
		hungerbox.totalvendors();
		
		vendor srs=new vendor();
		srs.createvenders("srs transportation services");
		srs.totalvendors();
		
		vendor bisleri=new vendor();
		bisleri.totalvendors();
		
	}

}

class vendor{
	static int totalvendors;
	
	
	void createvenders(String name) {
		System.out.println("creating vendors: "+name);
		totalvendors++;
	}
	void totalvendors() {
		System.out.println("no of vendors: "+totalvendors);
	}
		
}