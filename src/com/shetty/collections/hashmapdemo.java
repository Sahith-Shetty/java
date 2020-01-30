package com.shetty.collections;

import java.util.HashMap;

public class hashmapdemo {

	public static void main(String[] args) {

		HashMap hmap=new HashMap();
		hmap.put(11, "ravi");
		hmap.put(12, "ravi");
		hmap.put(77,"shetty");
		hmap.put(44, "sahi");
		
		System.out.println(hmap);
		System.out.println(hmap.get(11));
		System.out.println(hmap.get(50));
	}

}
