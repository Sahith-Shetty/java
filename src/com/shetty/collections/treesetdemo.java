package com.shetty.collections;

import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.tree.TreeNode;

public class treesetdemo {

	public static void main(String[] args) {

		TreeSet tset=new TreeSet();
		tset.add("bangalore");
		tset.add("delhi");
		tset.add("bangalore");
		tset.add("kolkata");
		tset.add("chennai");

		
		System.out.println(tset.size());
		System.out.println(tset);
	}

}
