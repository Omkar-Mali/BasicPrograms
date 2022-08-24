package com.Omkar.BasicProgramms;

import java.util.Scanner;

public class Star_Num_Pattern {
	
	public void leftStarTriangle() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(" * ");
				
			}
			
			System.out.println();
		}
	}
	
	public void leftNumTriangle() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(" " +i);
				
			}
			
			System.out.println();
		}
	}
	
	public void leftNumTriangle1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(" " +j);
				
			}
			
			System.out.println();
		}
	}
	
	public void leftNumTriangle2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(" "+(i+j));
				
			}
			
			System.out.println();
		}
	}
	

	public void leftInvStarTriangle() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=n; j>=i; j--) {
				
				System.out.print(" * ");
			}  
			
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		
		Star_Num_Pattern s = new Star_Num_Pattern();
		
		s.leftStarTriangle();
		
		s.leftNumTriangle();
		
		s.leftNumTriangle1();
		
		s.leftNumTriangle2();
		
		s.leftInvStarTriangle();

	}

}
