package com.practice;

public class PrimeNumber2 {

	public static void main(String[] args) {

		int count = 0, primecount=0;
	

		for (int i = 50; i <= 100; i++) {
			for (int j = 2; j <= i-1; j++) {

				if (i % j == 0) {
					count++;

				}
			}

			if (count == 0) {

				System.out.println(i);
				primecount+=1;

			} else {
				count = 0;
			}
		}
		System.out.println(primecount);

	}

}