package com.tyss.assignments.linkedlists;

import com.tyss.assignments.linkedlists.Node;;

public class Node<Any> {
	
	Any data;
	Node<Any> next;
	
	Node(Any d){
		this(d,null);
	}

	public Node(Any d, Node<Any> next) {
		this.data=d;
		this.next=next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
	
	
}
