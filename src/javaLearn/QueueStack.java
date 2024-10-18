package javaLearn;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueStack {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque();
		
		q.add(10);
		q.add(20);
		
		q.remove();
		
		q.add(30);
		System.out.println(q);
		
		System.out.println(q.peek());
		
		Stack<Integer> st = new Stack();
		
		st.push(10);
		st.push(20);
		st.pop();
		System.out.println(st);
		

	}

}
