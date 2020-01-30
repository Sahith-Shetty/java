package com.shetty.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class comparatordemo {

	public static void main(String[] args) {

		TreeSet<college> collegeset=new TreeSet<college>(new collegecomparator());
		collegeset.add(new college("RV","Bangalore","karnataka"));
		collegeset.add(new college("RIT","Bangalore","karnataka"));
		collegeset.add(new college("BIT","Mesra","Jharkand"));
		System.out.println(collegeset);
		for (college college : collegeset) {
			System.out.println(college.getName());
		}
	}

}
class collegecomparator implements Comparator<college>{

	@Override
	public int compare(college col1, college col2) {
		return col1.getName().compareTo(col2.getName());
	}
	
}
class college {
	String name;
	String city;
	String state;
	
	
	public college(String name, String city, String state) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "college [name=" + name + ", city=" + city + ", state=" + state + "]";
	}
	
}