package com.shetty.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class llistdemo {

	public static void main(String[] args) {

		List<Float> appraisal =new ArrayList<Float>();
		appraisal.add(2.75f);
		appraisal.add(3.95f);
		appraisal.add(4.8f);
		appraisal.add(4.3f);
		
		System.out.println(appraisal);
		
		//converting to linked list 
		appraisal=new LinkedList<>();
		appraisal.add(2.75f);
		appraisal.add(3.75f);
		appraisal.add(4.75f);
		appraisal.add(4.9f);

}
}