package javaLearn.collection;

class Node<T> {
	private T value;
	private Node left;
	private Node right;

	public Node(T val) {
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

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}

public class LinkedList {

	public static void main(String[] args) {
		Node n1 = new Node("1st Value");
		Node n2 = new Node(2);
		Node n3 = new Node("Thirty Two");
		Node n4 = new Node(true);
		Node n5 = new Node('A');
		Node n6 = new Node(10982);
		add(n1, n2);
		add(n2, n3);
		add(n3, n4);
		add(n4, n5);
		add(n5, n6);

		print(n1);

		System.out.println("gggggggggggggggggggggggggg");
		delete('A', n1);
		print(n1);
	}

	private static void print(Node currentNode) {
		do {
			System.out.println(currentNode.getValue());
			currentNode = currentNode.getRight();
		} while (currentNode.getRight() != null);
		System.out.println(currentNode.getValue());
	}

	public static void add(Node previous, Node current) {
		if (current.getLeft() == null) {
			previous.setRight(current);
			current.setLeft(previous);

		}
	}

	public static <T> void delete(T val, Node current) {
		boolean flag = true;
		while (flag) {
			Node previousNode = current.getLeft();
			Node nextNode = current.getRight();

			if (current.getValue().equals(val)) {
				if (nextNode == null) {
					previousNode.setRight(null);
					flag =false;
				} else if (previousNode == null) {
					nextNode.setLeft(null);
					flag =false;
				} else {
					previousNode.setRight(nextNode);
					nextNode.setLeft(previousNode);
					flag =false;
				}
			}
			current = current.getRight();
		}
		
	}

}
