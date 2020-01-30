package com.shetty.collections;

import java.util.ArrayList;

public class arraylistdemo {

	public static void main(String[] args) {

		ArrayList cities= new ArrayList();
		cities.add("bangalore");
		cities.add("delhi");
		cities.add("bangalore");
		cities.add("kolkata");
		cities.add("chennai");
		
		System.out.println(cities.size());
		System.out.println(cities);
	}

}
