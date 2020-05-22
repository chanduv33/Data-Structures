package com.tyss.assignments;

import java.util.Scanner;

public class TenthProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length for 1st Array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter Elements for 1st Array");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for "+(i+1)+" Element");
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter Length for 2nd Array");
		int[] arr1 = new int[sc.nextInt()];
		System.out.println("Enter Elements for 2nd Array");
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter value for "+(i+1)+" Element");
			arr1[i]= sc.nextInt();
		}
		
		int len = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr[i] == arr1[j]) {
					len++;
				}
			}
		}
		
		int[] intersection = new int[len];
		int init = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr[i] == arr1[j]) {
					intersection[init++]= arr[i];
				}
			}
		}
		
		for (int i = 0; i < intersection.length; i++) {
			System.out.print(intersection[i]+" ");
		}
	}
}
