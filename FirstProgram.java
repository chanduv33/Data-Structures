package com.tyss.assignments;

import java.util.Scanner;

public class FirstProgram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for "+(i+1)+" Element");
			arr[i]= sc.nextInt();
		}
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr[i]==j+1) {
					arr1[j]=arr1[j]+1;
				}
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]==0) {
				System.out.println("Missing element is "+ (i+1));
			}
		}
	}
}
