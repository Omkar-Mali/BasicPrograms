package com.Omkar.BasicProgramms;

import java.util.Scanner;

public class Prime_Number_Check {

	public void primeCheck() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to check:");

		int n = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= n; i++) {

			if (n % i == 0)

				count++;

		}

		if (count == 2) {

			System.out.println("Prime Number");

		}

		else {

			System.out.println("Not a Prime Number");
		}

	}

	public static void main(String[] args) {

		Prime_Number_Check p = new Prime_Number_Check();

		p.primeCheck();

	}

}
