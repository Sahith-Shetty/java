package com.shetty.miscellaneous;

public class arrayDemo {
static int[] marks;
static int val;
	public static void main(String[] args) {
		
		//initialization of array
		marks=new int[5];
		
		marks[0]=55;
		marks[1]=65;
		marks[2]=75;
		marks[3]=85;
		
		System.out.println("values are: "+val);
		System.out.println("marks are: "+marks);
		
		//dynamically
		float[] appraisalrates = {3.5f, 4.5f, 5.5f};
		
		System.out.println(appraisalrates[2]);
	}

}
