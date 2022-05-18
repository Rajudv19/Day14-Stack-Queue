package com.BridgeLabs.day14;
import java.util.LinkedList;

public class Queue {
	LinkedList<Integer> linkedList = new LinkedList<>();

	public void enQueue(int data) {
		linkedList.addLast(data);
	}

	public void deQueue() {
		if(linkedList.size() != 0) {
			System.out.println("Deleting Element from the queue: " + linkedList.pop());
		}
		else {
			System.out.println("queue Is empty");
		}
	}

	public void display() {
		System.out.println("---elements In queue---");
		for (Integer integer : linkedList) {
			System.out.println("Added data to list " + integer);
		}
	}
}
