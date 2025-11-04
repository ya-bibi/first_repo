package com.practice;

import java.util.HashSet;
import java.util.Set;

public class UniqueElementsPractice {

    public static void main(String[] args) {

        int[] a = {1, 4, 3, 4, 2, 2, 5, 6};

        Set<Integer> seen = new HashSet<>();  // 1
        Set<Integer> duplicates = new HashSet<>(); //  2 4 

        for (int num : a) {
        	Boolean status = seen.add(num); // 1  true 4 true 3 true false 2 true false 5 true
            if (status == false) {   // it is adding the element, and 
                duplicates.add(num); // 4 2 
            }
        }

        System.out.println(seen);
        System.out.println(duplicates);
        System.out.println("Elements that appear only once:"); // 2 4 
        for (int num : a) { // 1 4 3 4 2 2 5 6 
            if (!duplicates.contains(num)) {    // 3 contains 2, 4 false 
                System.out.print(num + " "); // 1
            }
        }
    }
}

