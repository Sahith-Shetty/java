package com.shetty.strings;

import java.util.StringTokenizer;

public class stringtokenizerdemo {
	public static void main(String[] args) {
		String name=args[0];
		System.out.println(name);
		
		String[] names=name.split(" ");
		for (String string : names) {
			System.out.println(string);
		}
		
		System.out.println("\n--------------\n");
		
		StringTokenizer nametokens= new StringTokenizer(name," ");
		while(nametokens.hasMoreTokens()) {
			System.out.println(nametokens.nextToken());
		}
		
				
	}
}
