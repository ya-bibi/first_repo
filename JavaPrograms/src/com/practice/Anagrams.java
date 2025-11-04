package com.practice;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";

//	     convert string into char array
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
//	     sort array	
		Arrays.sort(arr1);
		Arrays.sort(arr2);

//		 compare two array-if string1 not equal to string2 then not anagrams

		if (Arrays.equals(arr1, arr2)) {

			System.out.println("Strings are anagrams");
		} else {

			System.out.println("strings are not anagrams");
		}

	}

}
