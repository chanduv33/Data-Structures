package com.tyss.assignments;

import java.util.Scanner;

public class FifthProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for "+(i+1)+" Element");
			arr[i]= sc.nextInt();
		}
		int maxProduct = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int product = arr[i]*arr[j];
				if(maxProduct<product) {
					maxProduct = product;
				}
			}
		}
		System.out.println("Maximum product of two integers is "+maxProduct);
	}
}
