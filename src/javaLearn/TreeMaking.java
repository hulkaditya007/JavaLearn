package javaLearn;

import java.util.ArrayList;
import java.util.List;

class Node{
	int val;
	Node right;
	public Node getRight() {
		return right;
	}
	Node(int val,Node rightNode){
		this.val = val;
		this.right = rightNode;
	}
	public int getVal() {
		return val;
	}
	
	
}


public class TreeMaking {

	public static void main(String[] args) {
		Node node5 = new Node(5,null);
		Node node4 = new Node(4,node5);
		Node node3 = new Node(3,node4);
		Node node2 = new Node(2,node3);
		Node node1 = new Node(1,node2);
		Node currentNode = node1;
		while(currentNode.getRight()!=null) {
			System.out.println(currentNode.getVal());
			currentNode = currentNode.getRight();
		}
		System.out.println(currentNode.getVal());
	}
	
}
