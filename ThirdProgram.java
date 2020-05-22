package com.tyss.assignments;

import java.util.Scanner;

public class ThirdProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for "+(i+1)+" Element");
			arr[i]= sc.nextInt();
		}
		int biggest = arr[0];
		int smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>biggest) {
				biggest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Biggest Element is "+ biggest);
		System.out.println("Smallest Element is "+ smallest);
	}
}
