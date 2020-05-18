package datenstruktur;

public class Node {
	private int value;
	private Node next = null;
	
	public Node(int value) {
		this.value = value;
	}
	
	public boolean hasNext() {
		return next != null;
	}
	
	public Node next() {
		return this.next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
