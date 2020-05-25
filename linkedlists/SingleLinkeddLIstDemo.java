package com.tyss.assignments.linkedlists;

public class SingleLinkeddLIstDemo {
	public static void main(String[] args) {
		
		MyLinkedList<Integer> mll = new MyLinkedList<Integer>();
		
		mll.add(10);
		mll.add(20);
		mll.add(30);
		
		mll.add(40, 1);
		System.out.println(mll);
		
		System.out.println(mll.remove(40));
		
		
		System.out.println(mll);
		
	}
}
