package com.Omkar.BasicProgramms;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		//User input taken
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter First number (a): ");
						
		int a = sc.nextInt();
		
		System.out.println("Enter second number (b): ");
		
		int b = sc.nextInt();
		
		
		
		
		// Swapping Using third variable
		
		System.out.println("With using third variable");
		
		System.out.println("Two numbers before swapping are: " + a + " & " + b);	
		
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Two numbers after swapping are: "+ a + " & " + b);
		
		
//		OOOOOOOOOOORRRRRRRRRRRRRRR
		
		//Swapping Without using third variable
		
		System.out.println("Without using third variable");
		
		System.out.println("Two numbers before swapping are: " + a + " & " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Two numbers after swapping are: "+ a + " & " + b);
	
		

	}

}
