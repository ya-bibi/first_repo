package com.practice;


public class StringReverse2 {

	public static void main(String[] args) {
		String s= "Auto Test";
		String newS="";
		String sArr[]=s.split(" ");
		for (int i = sArr.length-1;i>=0;i--) {
			newS=newS+sArr[i]+" ";
		}
		System.out.println(newS);
	}

}
