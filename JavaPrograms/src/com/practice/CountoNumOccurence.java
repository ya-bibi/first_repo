package com.practice;

import java.util.HashMap;
import java.util.Map;

public class CountoNumOccurence {

	public static void main(String[] args) {
		int arr[] = { 12, 4, 5, 12, 4, 5, 6 };

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer num : arr) {

			if (map.containsKey(num)) {

				map.put(num, map.get(num) + 1);
			} else {

				map.put(num, 1);
			}
		}

		System.out.println(map);

	}

}
