package com.tyss.assignments;

import java.util.Scanner;

public class FourthProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for "+(i+1)+" Element");
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		
		
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i+1; j < arr.length; j++) {
				sum = arr[i]+arr[j];
				if(sum == num) {
					System.out.println(arr[i]+" "+arr[j]);
				} 
			}
		}
	}
}
