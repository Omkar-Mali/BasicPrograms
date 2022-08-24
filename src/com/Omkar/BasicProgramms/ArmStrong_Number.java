package com.Omkar.BasicProgramms;

import java.util.Scanner;

public class ArmStrong_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to check armstrong or not");
		
		int n = sc.nextInt();				//User input stored in n
		
		int check=n;						//Stored user-input in another variable
		
		int sum = 0;
		int rem;
		
		while(n!=0) {
			
			rem = n%10;						// separating digits of Number
			
			sum = sum + rem*rem*rem;        // Calculating sum of cube of numbers
			
			n=n/10;							//End condition for while loop
		}
		System.out.println("Number after sum of cube of digits is:" + sum);
				
		if(check==sum) {
			System.out.println("Number is armstrong");
		}
		else {
			System.out.println("Number is not armstrong");
		}
	
	}

}
