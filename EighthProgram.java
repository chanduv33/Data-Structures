package com.tyss.assignments;

import java.util.Scanner;

public class EighthProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for "+(i+1)+" Element");
			arr[i]= sc.nextInt();
		}
		int numberOfDuplicates = 0;
		for (int i = 0; i < arr.length; i++) {
			int count =0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j] && j<i) {
					break;
				}
				if(arr[i]==arr[j] && i!=j) {
					count++;
				}
			}
			if(count!= 0) {
				numberOfDuplicates++;
			}
		}
		System.out.println("Duplicates "+numberOfDuplicates);
		int[] array = new int[arr.length-numberOfDuplicates];
		int initialValue =0;
		for (int i = 0; i < arr.length; i++) {
			int count =0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j] && j<i) {
					break;
				}
				if(arr[i]==arr[j] && i!=j) {
					count++;
				}
			}
			if(count== 0) {
				array[initialValue++] = arr[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
