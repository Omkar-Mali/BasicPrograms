package com.Omkar.BasicProgramms;

public class Prime_Number_List {

	public void primeNumbers(int n) {

//		If there are only two factors then it will be prime numbers
		int total = 0;

		for (int i = 1; i <= n; i++) {

			int count = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {

					count++;
				}
			}

			if (count == 2) {

				System.out.println(i);
				total++;
			}

		}

		System.out.println("Total number of prime numbers are: " + total);

	}

	public static void main(String[] args) {

		Prime_Number_List p = new Prime_Number_List();

		p.primeNumbers(100);

	}

}
