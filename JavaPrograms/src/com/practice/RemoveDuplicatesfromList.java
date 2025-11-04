package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesfromList {

	public static void main(String[] args) {
		   List<String> list = new ArrayList<>();
	        list.add("Banana");
	        list.add("Apple");
	        list.add("Orange");
	        list.add("Mango");
	        list.add("Apple");
	       
	       System.out.println(list);
	       
	       Set<String> set= new HashSet<String>(list);
	       List<String> unique= new ArrayList<String>(set);
	    //   for(String s: set){
	    //       set.add(s);
	            System.out.println(unique);
	       }
	    

	}


