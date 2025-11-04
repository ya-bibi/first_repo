package com.practice;

public class FibonaciSeries {

	public static void main(String[] args) {

		int n;
		int num1 = 0, num2 = 1;
		for (int i = 0; i < 10; i++) {

			System.out.println(num1);
			int value = num1 + num2;
			num1 = num2;
			num2 = value;

		}

	}

}
