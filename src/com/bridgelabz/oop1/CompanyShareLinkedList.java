package com.bridgelabz.oop1;

public class CompanyShareLinkedList<T> {
	Node head;

	public class Node {
		Object data;
		Node next;

	}

	// add
	public void add(T data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	// display
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	// delete
	public void delete() {
		Node node = head;
		head = head.next;

	}
}
