package com.practice;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWordFromSentenceWithPunctuation {

	public static void main(String[] args) {
		
		   String str = "Hello world! Hello everyone. Welcome to the world.";
	        
	        Map<String, Integer> map= new HashMap<>();
	        
	        for(String s: str.split(" ")){
	        	
	            s=s.replaceAll("[^a-zA-Z0-9]", "");
	            
	            if(map.containsKey(s)){
	                
	                map.put(s, map.get(s)+1);
	            }else{
	                
	                map.put(s,1);
	            }
	        }
	       System.out.println(map);

	}

}
