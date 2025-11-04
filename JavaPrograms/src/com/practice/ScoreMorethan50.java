package com.practice;

import java.util.HashMap;
import java.util.Map;

public class ScoreMorethan50 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Dhoni", 72);
		map.put("Virat", 51);
		map.put("Hardhik", 41);
		map.put("Pant", 37);
		map.put("Rohit", 84);
		map.put("Surya", 18);
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>50)
			{
				System.out.println(entry.getKey()+ " Scored "+ entry.getValue());
			}
			
		}

		
		}
}
