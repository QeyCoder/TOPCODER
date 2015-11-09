package net.gaurav.practice.helper;

public class SLList {
	private int data;
	private SLList next;

	public SLList(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SLList getNext() {
		return next;
	}

	public void setNext(SLList next) {
		this.next = next;
	}
}