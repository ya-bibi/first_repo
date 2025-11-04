package com.practice;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter number");	
//		int num = sc.nextInt();
		int num = 1234;
		int count = 0;

		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("count of digits:" + count);
	}

}
