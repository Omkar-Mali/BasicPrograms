package com.Omkar.BasicProgramms;

import java.util.Random;

public class RandomNameGenerator {

	public static void main(String[] args) {

		int id;

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {

			int swap = rand.nextInt(arr.length);
			System.out.println("This is happening in swap " + swap);

			// To avoid repetition of numbers
			int temp = arr[swap];
			arr[swap] = arr[i];
			arr[i] = temp;

		}

//        System.  out.print(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {

			id = arr[i];

			System.out.println(id);

		}

	}
}