package com.practice;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str="madam";
		String rev="";
		String orgstr=str;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}

		if(orgstr.equals(rev))
		{
			System.out.println(orgstr+":Is palindrome");
		}else
		{
			System.out.println(orgstr+":Is not palindrome");
		}
	}

}
