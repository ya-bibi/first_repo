package com.practice;

public class SortingArrayDesecending {

	public static void main(String[] args) {

		int arr[] = { 5, 10, 28, 16, 35, 50, 19 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			System.out.print(arr[i] + " ");
		}
        System.out.println();
		System.out.println("2nd largest number:" + arr[1]);
	}

}
