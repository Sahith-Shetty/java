package com.shetty.miscellaneous;

public class SwtchDemo {

	public static void main(String[] args) {
		String day = args[0];
		System.out.println("entered day"+day);
		
		days convertedinput=mappingdaystoenum(day);
		System.out.println("enum map day:"+convertedinput);
		
		switch (convertedinput) {
		case MONDAY:
			System.out.println("working day");
			break;
		case TUEDAY:
			System.out.println("working day");
			break;
		case WEDNUSDAY:
			System.out.println("working day");
			break;
		case THURSDAY:
			System.out.println("working day");
			break;
		case FRIDAY:
			System.out.println("working day");
			break;
		case SATURDAY:
			System.out.println("holiday day");
			break;
		case SUNDAY:
			System.out.println("holiday day");
			break;
		default:
			System.out.println("please provide the right value");

		}

	}

	private static days mappingdaystoenum(String day) {
		switch(day.toLowerCase()) {
		case "mon":
			return days.MONDAY;
		case "tue":
			return days.TUEDAY;
		case "wed":
			return days.WEDNUSDAY;
		case "thu":
			return days.THURSDAY;
		case "fri":
			return days.FRIDAY;
		case "sat":
			return days.SATURDAY;
		case "sun":
			return days.SUNDAY;
		default:
			return null;	
		}
		
	}


}

enum days {
	MONDAY, TUEDAY, WEDNUSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}