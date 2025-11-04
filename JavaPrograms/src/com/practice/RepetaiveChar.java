package com.practice;

import java.util.HashMap;
import java.util.Map;

public class RepetaiveChar {

	public static void main(String[] args) {
		
		String s="Google";
		s=s.toLowerCase();
		System.out.println(s);
		Map<Character, Integer> map=new HashMap<>();
		
		for(Character ch:s.toCharArray())
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		String S1="";
		
		for(Character ch:map.keySet())
		{
			if(map.get(ch)==2)
			{
				S1=S1+ch;
			}		
		}
		System.out.println(S1);

	}

}
