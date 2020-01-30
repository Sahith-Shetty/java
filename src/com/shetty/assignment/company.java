package com.shetty.assignment;
import java.util.Scanner;
public class company {

	int comid;
	String comname;
	String location;
	String founder;
	Scanner scan= new Scanner(System.in);
	
	
	@Override
	public String toString() {
		return "company [comid=" + comid + ", comname=" + comname + ", location=" + location + ", founder=" + founder
				+ "]";
	}
	public int getComid() {
		return comid;
	}
	public void setComid(int comid) {
		this.comid = comid;
	}
	public String getComname() {
		return comname;
	}
	public void setComname() {
		System.out.println("Enter company name: ");
		comname = scan.nextLine();
		this.comname = comname;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder() {
		System.out.println("Enter company founder name: ");
		founder = scan.nextLine();
		this.founder = founder;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation() {
		System.out.println("Enter company location: ");
		location = scan.nextLine();
		this.location = location;
	}
}
