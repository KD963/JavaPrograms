package com.bridgelabz.oop1;

class Node<T> {
	Object data;
	Node next;
}

public class StockSymbolLinkedList<T> {

	Node head = null;

	// insert
	public void insert(T data) {

		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	// display
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	// isEmpty
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	// delete
	public void delete() {
		Node node = head;
		head = head.next;
	}
}
