package com.shetty.collections;

import java.util.Hashtable;

public class hashtabledemo {

	public static void main(String[] args) {

		Hashtable<Integer, Double> emprating=new Hashtable<>();
		emprating.put(111, 2.75);
		emprating.put(112, 2.75);
		emprating.put(112, 2.25);//neither key nor value can be null
		
		System.out.println(emprating);
		
	}

}
