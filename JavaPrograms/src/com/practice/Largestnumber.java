package com.practice;

public class Largestnumber {

	public static void main(String[] args) {

		int a = 200, b = 700, c = 300;

		if (a > b && a > c) {
			System.out.println("largest number:" + a);
		} else if (b > a && b > c) {
			System.out.println("largest number:" + b);
		} else {
			System.out.println("largest number:" + c);
		}

	}

}
