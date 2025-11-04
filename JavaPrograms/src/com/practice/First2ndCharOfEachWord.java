package com.practice;

public class First2ndCharOfEachWord {

	public static void main(String[] args) {
		

		
		String str = "I am an automation tester"; 
		
		String s[]= str.split(" ");
		 for(String word:s) {
			 if(word.length()>1)
			 {
				char ch1= word.charAt(1);
				System.out.println("2nd char from starting:"+ word +":"+ ch1);
			 }
		 }
	}

}
