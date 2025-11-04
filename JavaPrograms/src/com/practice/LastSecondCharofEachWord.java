package com.practice;


public class LastSecondCharofEachWord {

	public static void main(String[] args) {
		
		String str = "I am an automation tester"; 
		String s[]= str.split(" ");
//		for(String word: s) {
		for(int i=0;i<s.length;i++) {
			String word=s[i];
		
		if(word.length()>1) {
			
			char ch=word.charAt(word.length()-2);
			System.out.println("2nd char:" + word + ":"+ch);
		}
		

	}

	}
}
