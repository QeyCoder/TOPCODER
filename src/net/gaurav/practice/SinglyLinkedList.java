package net.gaurav.practice;

import net.gaurav.practice.helper.SLList;

public class SinglyLinkedList {
	static SLList head;

	private static int listLength() {
		int length = 0;
		SLList currentNode = head;
		while (currentNode != null) {
			currentNode = currentNode.getNext();
			length++;
		}
		return length;
	}

	public static void main(String[] args) {
		head = new SLList(1);
		SLList a = new SLList(2);
		head.setNext(a);
		SLList b = new SLList(3);
		a.setNext(b);
		SLList c = new SLList(4);
		b.setNext(c);
		SLList d = new SLList(5);
		c.setNext(d);
		// System.out.println(listLength(head));
		traverseList();
		System.out.println("Traverse List Once Again after removing Node at index 2");
		deleteNodeByIndex(2);
		traverseList();
		System.out.println("Traverse List Once Again after removing HEAD");
		deleteHead();
		traverseList();
		System.out.println("Traverse List Once Again after removing TAIL");
		deleteTail();
		traverseList();
		/*
		 * System.out.println("Traverse List Once Again after removing TAIL");
		 * deleteTail(head); traverseList(head);
		 */
	}

	private static synchronized void deleteTail() {
		SLList currentNode = head;
		SLList preNode = null;
		while (currentNode.getNext() != null) {
			preNode = currentNode;
			currentNode = currentNode.getNext();
		}
		preNode.setNext(null);
	}

	private static synchronized SLList deleteHead() {
		SLList currentNode = head;
		head = currentNode.getNext();
		currentNode = null;
		return head;
	}

	private static synchronized void deleteNodeByIndex(int i) {
		int length = 1;
		SLList currentNode = head;
		SLList preNode = null;
		while (length != i) {
			preNode = currentNode;
			currentNode = currentNode.getNext();
			length++;
		}
		preNode.setNext(currentNode.getNext());
	}

	private static synchronized void traverseList() {
		SLList currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.getData() + "L");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

}
