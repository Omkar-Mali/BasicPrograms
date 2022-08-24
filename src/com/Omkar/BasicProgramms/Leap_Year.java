package com.Omkar.BasicProgramms;
import java.util.Scanner;

public class Leap_Year {
	
	Scanner sc = new Scanner(System.in);
	
	public void leapYear() {
		
	
	System.out.println("Enter year: ");
	
	int year = sc.nextInt();
	
	if(year%400==0 || (year%4==0 && year%100!=0)) {
		
		System.out.println("Leap Year");
	}
	else {
		
		System.out.println("Not a leap year");
	}
	
	sc.close();

	}
	
	

	public static void main(String[] args) {

		Leap_Year l = new Leap_Year();
		
		l.leapYear();
		
		
		

	}

}
