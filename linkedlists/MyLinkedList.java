package com.tyss.assignments.linkedlists;

import java.util.NoSuchElementException;

import com.tyss.assignments.linkedlists.Node;

public class MyLinkedList<Any> {
	Node<Any> head ;
	Node<Any> tail ;
	Node<Any> first;
	private int size;
	
	public MyLinkedList() {
		first = null;
		head = first;
		tail = first;
	}
	
	public boolean add(Any a) {
		if(isEmpty()) {
			first = new Node<Any>(a);
			head = first;
			tail = first;
		} else {
			Node<Any> temp = first;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next= new Node(a,null);
			tail=temp.next;
		}
		size++;
		return true;
	}
	
	public boolean add(Any a,int index) {
		if(isEmpty() || index < 0 ) {
			System.out.println("No Such index is found");
		} else if(index == 0 && first == null) {
			first = new Node<Any>(a);
			head = first;
			tail = first;
		} else if(index == 0 && first != null) {
			first = new Node(a);
			first.next = head.next;
			head = first;
		}else if(index != 0 ) {
			int count = 0;
			Node<Any> temp = first;
			while(temp.next!=null) {
				if(count == index-1 ) {
					Node<Any>	newTemp = new Node(a);
					newTemp.next=temp.next;
					temp.next = newTemp;
					break;
				} else {
					temp = temp.next;
					count++;
				} 
			}
			if(count == index && temp.next == null) {
				temp.next= new Node(a,null);
				tail=temp.next;
			}	
		} else {
			tail.next = new Node(a,null);
			tail = tail.next;
		}
		size++;
		return true;
	}
	
	
	public boolean isEmpty() {
		if( size == 0 ) {
			return true;
		} else {
			return false;
		}
	}

	public boolean remove(Any a) {
		if(isEmpty()) {
			throw new NoSuchElementException("Element not found");
		}
		if(first.data.equals(a)) {
			first=first.next;
			head = first;
			size--;
			return true;
		} else {
			Node<Any> current = first;
			while(current.next!=null && !current.next.data.equals(a)) {
				current = current.next;
			}
			if(current.next==null) {
				throw new NoSuchElementException("Element not found");
			}
			if(current.next != null) {
				if(current.next == tail) {
					tail = current;
					current.next=null;
				}
				else {
				current.next = current.next.next;
				}
			}
			
			size--;
			return true;
		}
	}
	
	
	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + ", tail=" + tail + ", first=" + first + ", size=" + size + "]";
	}
	
	
	
}
