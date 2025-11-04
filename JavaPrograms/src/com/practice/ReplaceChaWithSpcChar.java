package com.practice;

public class ReplaceChaWithSpcChar {

	public static void main(String[] args) {
		String str = "jaya";
		char ch[] = str.toCharArray();
		String newStr = "";
		int count = 0;

		for (char c : ch) {

			if (c == 'a') {
				count++;
				for (int i = 0; i < count; i++) {
					newStr = newStr + '#';
				}
			} else {
				newStr = newStr + c;
			}
		}

		System.out.println(newStr);
	}

}
