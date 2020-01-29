package com.shetty.miscellaneous;

public class thisDemo {
	
	int count;
	public static void main(String[] args) {
		thisDemo td= new thisDemo();
		td.process();

	}
	private void process() {
		System.out.println("count value :"+count);
		
		setcount(148);
		System.out.println("updated count: "+count);
		
	}
	private void setcount(int count) {
		this.count =count;
		//this points to the current object
	}

}
