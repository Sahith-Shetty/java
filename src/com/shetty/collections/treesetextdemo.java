package com.shetty.collections;

import java.util.TreeSet;


public class treesetextdemo {

	public static void main(String[] args) {

		TreeSet<furniture> furnset=new TreeSet<>();
		System.out.println(furnset);
		
		furnset.add(new furniture("chair","plastic"));
		furniture table=new furniture("table","glass");
		furnset.add(table);
		
		furnset.add(new furniture("cot","plywood"));
		furnset.add(new furniture("box","solidwood"));
		furnset.add(new furniture("wall","acrylic"));
		
		System.out.println(furnset);
		
		for (furniture furniture : furnset) {
			System.out.println(furniture.getName());
		}
	}

}
class furniture implements Comparable<furniture>{
	String name;
	String material;
	
	public furniture(String name, String material) {
		super();
		this.name = name;
		this.material = material;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public int compareTo(furniture another) {
		return name.compareTo(another.name);
	}
	@Override
	public String toString() {
		return "furniture [name=" + name + ", material=" + material + "]";
	}
	
	
}