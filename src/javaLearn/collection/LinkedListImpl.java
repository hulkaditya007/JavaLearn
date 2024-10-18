package javaLearn.collection;

class Node1<T> {
	T value;
	private Node1 left;
	private Node1 right;

	Node1(T val) {
		this.value = val;
		this.left = null;
		this.right = null;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node1 getLeft() {
		return left;
	}

	public void setLeft(Node1 left) {
		this.left = left;
	}

	public Node1 getRight() {
		return right;
	}

	public void setRight(Node1 right) {
		this.right = right;
	}

}

public class LinkedListImpl {

	static Node1 lastLinkedNode = null;
	public static void main(String[] args) {
		
		

	}
	
	public static <T> void addNode1(T value) {
		Node1 n1 = new Node1(10);
		if(lastLinkedNode == null) {
			lastLinkedNode = n1;
		}else {
			lastLinkedNode.setRight(n1);
			n1.setLeft(lastLinkedNode);
		}
		
		
	}

}
