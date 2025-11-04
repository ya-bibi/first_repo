package com.practice;

public class SwapNumber {

	public static void main(String[] args) {

		int a = 10, b = 20;

		System.out.println("Before swapping values:" + a + " " + b);
//		
//	int	t=a;
//		a=b;
//		b=t;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping values:" + a + " " + b);

	}

}
