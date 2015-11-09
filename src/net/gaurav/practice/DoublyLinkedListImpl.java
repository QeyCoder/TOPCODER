package net.gaurav.practice;

import net.gaurav.practice.helper.DLLNode;

public class DoublyLinkedListImpl {

	private static DLLNode head;

	public static void main(String[] args) {
		System.out.println("Creating new Linked List and  1 at head");
		head = new DLLNode(1);
		traverse();
		System.out.println("inserting  2 at head");
		insertHead(2);
		traverse();

		System.out.println("Inserting 3 at tail");
		insertTail(3);
		traverse();

		System.out.println("Inserting 4 at where previous node is 2");
		insertAfter(2, 4);
		traverse();

		System.out.println("Inserting node 5 at index 3");
		insertAtIndex(3, 5);
		traverse();

		System.out.println("length of list is :");
		getLengthOfLinkList();
	}

	private static void getLengthOfLinkList() {
		int length = 0;
		DLLNode currentNode = head;
		while (currentNode != null) {
			currentNode = currentNode.getNext();
			length++;
		}
		System.out.println(length);
	}

	private static void insertAtIndex(int i, int data) {

		int length = 0;
		DLLNode currentNode = head;
		DLLNode prevNode = null;
		while (i != length) {
			prevNode = currentNode;
			currentNode = currentNode.getNext();
			length++;
		}
		DLLNode dataToBeInserted = new DLLNode(data);
		prevNode.setNext(dataToBeInserted);
		dataToBeInserted.setPrev(prevNode);
		dataToBeInserted.setNext(currentNode);
		currentNode.setPrev(dataToBeInserted);
	}

	private static void insertAfter(int insertafter, int data) {
		DLLNode currentNode = head;
		DLLNode prevNode = null;
		while (prevNode.getData() != insertafter) {
			prevNode = currentNode;
			currentNode = currentNode.getNext();
		}
		DLLNode dataToBeInserted = new DLLNode(data);
		prevNode.setNext(dataToBeInserted);
		dataToBeInserted.setPrev(prevNode);
		dataToBeInserted.setNext(currentNode);
		currentNode.setPrev(dataToBeInserted);
	}

	private static void insertTail(int data) {
		DLLNode currentNode = head;
		DLLNode prevNode = null;
		while (currentNode != null) {
			prevNode = currentNode;
			currentNode = currentNode.getNext();
		}
		DLLNode dataToBeInserted = new DLLNode(data);
		prevNode.setNext(dataToBeInserted);
		dataToBeInserted.setPrev(prevNode);
		dataToBeInserted.setNext(currentNode);
	}

	private static void insertHead(int data) {
		DLLNode currentNode = head;
		DLLNode dataToBeInserted = new DLLNode(data);
		DLLNode next = currentNode.getNext();
		if (next != null) {
			next.setPrev(dataToBeInserted);
			dataToBeInserted.setNext(next);
		}
	}

	private static void traverse() {
		DLLNode currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}

}
