package com.BridgeLabs.day14;
import java.util.LinkedList;

public class Stack {
	LinkedList<Integer> linkedList = new LinkedList<>();

	public void insert(int data) {
		linkedList.addFirst(data);
	}

	public void peak() {
		System.out.println("Peak Element from the queue: "+linkedList.peek());
	}

	public void delete() {
		if(linkedList.size() != 0) {
			System.out.println("POP Element from the queue: " + linkedList.pop());

		}else {
			System.out.println("Stack is empty");
			return;
		}
	}

	public void display() {
		for (Integer integer : linkedList) {
			System.out.println("Displaying the List "+integer);
		}
	}
}
