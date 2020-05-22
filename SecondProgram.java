package com.tyss.assignments;

import java.util.Scanner;

public class SecondProgram {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter length");
		int[] arr= new int[sc.nextInt()];		
		arr = readElements(arr);
		
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
				System.out.println(arr[i]+" ");
			}
		}
	}
	
	static int[] readElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for "+(i+1)+" Element");
			int ele = sc.nextInt();
			if(ele <= arr.length-2 && ele>=0)
			arr[i]=ele;
			else {
				System.out.println("Enter the values in between 0 - "+ (arr.length-2));
				readElements(arr);
			}
		}
		return arr;
	}
}
