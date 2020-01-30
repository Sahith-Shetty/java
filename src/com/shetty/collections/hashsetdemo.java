package com.shetty.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class hashsetdemo {

	public static void main(String[] args) {

		HashSet hset=new HashSet();
		hset.add("bangalore");
		hset.add("delhi");
		hset.add("bangalore");
		hset.add("kolkata");
		hset.add("chennai");

		
		System.out.println(hset.size());
		System.out.println(hset);
	}

}
