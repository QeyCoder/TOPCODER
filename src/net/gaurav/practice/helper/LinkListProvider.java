package net.gaurav.practice.helper;

import java.util.LinkedList;

public class LinkListProvider {
	SLList list = new SLList(1);
	LinkedList<Integer> linkedList = new LinkedList<>();

	public LinkedList<Integer> getLinkedList() {
		return linkedList;
	}

	public void setLinkedList(LinkedList<Integer> linkedList) {
		this.linkedList = linkedList;
	}

	public void init() {
		for (int i = 0; i < 100; i++) {
			linkedList.add(i);
		}
	}

}
