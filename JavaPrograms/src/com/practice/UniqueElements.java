package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		
		int arr[]= {2, 3, 4, 5, 4, 2, 6};
		Set<Integer> set=new HashSet<>();
		for(int num:arr) {
			set.add(num);
			
		}
		int[] unique = new int[set.size()];
        int i = 0;
        for (int num : set) {
            unique[i++] = num;//2,3,
		
	}
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Array without duplicates: " + Arrays.toString(unique));
	}

	}

