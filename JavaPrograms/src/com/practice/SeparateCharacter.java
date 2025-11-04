package com.practice;

public class SeparateCharacter {

	public static void main(String[] args) {

		String str = "hiJava787^@&gh8y";

//	define string for each
		String letter = ""; 
		String digit = "";
		String spclChar = "";

//		using for loop
		for (int i = 0; i <str.length(); i++) {

			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				letter = letter + ch;
			} else if (Character.isDigit(ch)) {
				digit = digit + ch; 
			} else {
				spclChar = spclChar + ch;
			}
		}
		System.out.println("letters:" +letter);
		System.out.println("digit:" +digit);
		System.out.println("spclChar:" +spclChar);

	}

}
