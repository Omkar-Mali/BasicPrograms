package com.Omkar.BasicProgramms;

public class AlternatePrimeNumbers {

	public static void main(String[] args) {

		int temp = 1;

		for (int i = 1; i <= 20; i++) {

			int count = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {

					count++;
				}
			}
			if (count == 2) {

				temp++;

				if (temp % 2 == 0) {

					System.out.println(i);

				}
			}
		}
	}
}
