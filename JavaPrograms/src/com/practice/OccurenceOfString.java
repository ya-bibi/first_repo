package com.practice;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfString {

	public static void main(String[] args) {
		
		String str="my name is hello world my is";
		
		Map<String, Integer> map=new HashMap<>();
		
		for(String s : str.split(" "))
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
			{
				map.put(s, 1);
			}
		}
		
		System.out.println(map);

	}

}
