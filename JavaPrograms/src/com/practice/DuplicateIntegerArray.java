package com.practice;

public class DuplicateIntegerArray {

	public static void main(String[] args) {
		
		int a[]= {1,4,3,4,2,2,5,6};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				
			{
				
				if(a[i]==a[j])
				{
					System.out.println("Find duplicate Element:" +a[i]);
				
			}
		}
	}
	}
}

