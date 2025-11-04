package com.practice;

public class ReverseWord {

	public static void main(String[] args) {

		String s = "yasmin is good";
		String s1[] = s.split(" ");
		String revWord = "";
		
		for(String word:s1) {
//		for (int i = 0; i < s1.length; i++) {
//
//			String word = s1[i];
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord +word.charAt(j);

			}
			revWord = revWord + " ";

		}
		System.out.println(revWord);
	}
 
}