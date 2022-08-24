package com.Omkar.BasicProgramms;

//A number is called an automorphic number if and only if the square of the given number ends with the same number itself.For example,25,76 are automorphic numbers

public class AutomorphicNumber {

	public static void main(String[] args) {

		int num = 25;
		int num1 = num;
		int square = num * num;
		int sq = square;

		System.out.println("Square is: " + square);

		while (num1 % 10 != square % 10) { // (25%10 != 625%10)

			num1 = num1 / 10;
			square = square / 10;
		}

		System.out.println(num1);

		if (num == num1) {
			System.out.println("Automorphic number");
		} else {
			System.out.println("Not automorphic number");
		}

	}

}
