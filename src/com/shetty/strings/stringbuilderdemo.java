package com.shetty.strings;

public class stringbuilderdemo {
	public static void main(String[] args) {
		
		String name="sahith";
		name=name+"r";
		name=name+"shetty";
		
		StringBuffer sbuff=new StringBuffer();
		
		StringBuilder sb=new StringBuilder();
		sbuff.append("sahith");
		System.out.println(sbuff);
		
		sbuff.append("r");
		System.out.println(sbuff);
		
		sbuff.append("shetty");
		System.out.println(sbuff);
		
	}
}
