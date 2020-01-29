package com.shetty.classes;

import java.util.Scanner;

public class employee {

	int empid;
	String empname;
	String dept;
	String projectname;
	Scanner scan= new Scanner(System.in);
	
	@Override
	public String toString() {
		return "employee [empid=" + empid + ", empname=" + empname + ", dept=" + dept + ", projectname=" + projectname
				+ "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid() {
		System.out.println("Enter employee id: ");
		int empid = Integer.parseInt(scan.nextLine());
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname() {
		System.out.println("Enter employee name: ");
		empname = scan.nextLine();
		this.empname = empname;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname() {
		System.out.println("Enter project name: ");
		projectname = scan.nextLine();
		this.projectname = projectname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept() {
		System.out.println("Enter dept: ");
		dept = scan.nextLine();
		this.dept = dept;
	}

	
}
