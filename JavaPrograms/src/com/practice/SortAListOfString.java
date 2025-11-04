package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAListOfString {

	public static void main(String[] args) {
		
		 List<String> names = new ArrayList<>();
	        names.add("Banana");
	        names.add("Apple");
	        names.add("Mango");
	        names.add("Cherry");
	        names.add("Orange");
	        
	        Collections.sort(names);
	        System.out.println("sorted list:" + names);
	        
//	        sort in reverse order
	        Collections.sort(names, Collections.reverseOrder());
	        System.out.println("reverse order:" +names);
	        

	}

}
