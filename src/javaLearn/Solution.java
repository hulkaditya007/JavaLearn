package javaLearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//  Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 


public class Solution {

	public static void main(String[] args) {
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(6);
		
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(5);
		
		ListNode outPut = mergeTwoLists(list1,list2);
		while(outPut!=null){
            System.out.println(outPut.val);
            outPut = outPut.next;
        }

	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> li1 = new ArrayList<>();
        while(list1!=null){
            li1.add(list1.val);
            list1 = list1.next;
        }
        while(list2!=null){
            li1.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(li1);
        System.out.println(li1);
        ListNode lastNode = new ListNode();
        if(li1.size()>=0) {
        ListNode startNode = new ListNode(li1.get(0));
        lastNode = startNode;
        for(int i=1;i<li1.size();i++){
            ListNode cr = new ListNode(li1.get(i));
            startNode.next = cr;
            startNode = cr;
        }
        }
        return lastNode;
    }

}
