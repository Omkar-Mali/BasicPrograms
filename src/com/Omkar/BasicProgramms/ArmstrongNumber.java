package com.Omkar.BasicProgramms;

import java.util.Scanner;

public class ArmstrongNumber {

	public void armstrong() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no : ");
		
		int no = sc.nextInt();
		
		int t1 = no;
		
		int length=0;
		
		while(t1!=0) {
			
			t1=t1/10;
			
			length++;
		}
		System.out.println("Number of digits in number are: "+length);
	

		int t2=no;
		int rem;
		int arm=0;
		
		while(t2!=0) {
			
			rem = t2 % 10;
			
			int multi = 1;
			
			for(int i=1; i<=length; i++) {       //for loop used for multiplication length times
				
				multi = multi*rem;     //1*3=3   //3*3=9   //9*3=27
				
			}
			
			arm = arm + multi;
						
			t2=t2/10;
			
		}
		
		System.out.println("The result is: "+ arm);
		
		if(arm==no) {
			
			System.out.println("armstrong number");
		}
		else {
			System.out.println("Not a armstrong number");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ArmstrongNumber a = new ArmstrongNumber();
		
		a.armstrong();
		

	}

}
