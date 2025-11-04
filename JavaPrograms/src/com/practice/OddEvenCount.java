package com.practice;

public class OddEvenCount {

	public static void main(String[] args) {

		int num = 765489;
		int evencount = 0;
		int oddcount = 0;

		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}

			num = num / 10;

		}
		System.out.println("even count:" + evencount);
		System.out.println("odd count:" + oddcount);

	}
}
