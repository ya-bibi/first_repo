package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonReptiveCharacter {

	public static void main(String[] args) {

		String str = "sshhywiss";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);

			} else {
				map.put(ch, 1);

			}
		}
		System.out.println(map);
		System.out.println(map.keySet());

//		String s="";
		List<Character> list = new ArrayList<>();
		for (Character ch1 : map.keySet()) {
			if (map.get(ch1) == 1) {
				list.add(ch1);
			}
		}
		System.out.println(list);

	}

}
