package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotRepeatingCharacter {

	public static void main(String[] args) {
		
		String input="sshhywiss";
		String newString = "";
		
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(Character ch:input.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		System.out.println(map.keySet());
		List<Character> list = new ArrayList<Character>();
		for(Character ch:map.keySet()) {
			if(map.get(ch)==1) {
				list.add(ch);
				newString=newString+ch;
			}
		}
		System.out.println(list);
		System.out.println(newString);
	}

}
