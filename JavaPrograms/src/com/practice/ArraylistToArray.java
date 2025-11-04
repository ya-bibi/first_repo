package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ArraylistToArray {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("abhi");
		list.add("ashi");
		list.add("yash");
		
		String arr[]=new String[list.size()];
		arr=list.toArray(arr);
		for(String s:arr) {
			System.out.println(s+" ");
		}
	}

}
