package com.practice;

public class FindDuplicatesElementArray {

	public static void main(String[] args) {
		
		String a[]= {"java","C","C++","Phython","java"};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Find the element:"+ a[i]);
				}
			}
		}

	}

}
