package com.shetty.collections;

import java.util.ArrayList;

public class rawcollecdemo {

	public static void main(String[] args) {

		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(76);
		marks.add(59);
		marks.add(85);
		marks.add(45);
		marks.add(66);
		
		System.out.println(marks);
		
		for (Integer mark : marks) {
			mark=mark+10;
			System.out.println(mark);
		}
		
	}

}
