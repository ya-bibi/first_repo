package com.practice;

import java.util.HashSet;
import java.util.Set;

public class IntersectionInArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 2, 4, 5, 6 };
		int[] arr2 = { 2, 3, 4, 6, 7 };

		Set<Integer> set = new HashSet<Integer>();
		for (int num : arr1) {

			set.add(num);
		}

		for (int num1 : arr2) {
			if (set.contains(num1)) {

				System.out.println(num1);
			}
		}

	}

}
