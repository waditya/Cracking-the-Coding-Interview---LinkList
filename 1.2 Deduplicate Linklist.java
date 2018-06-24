package BusinessLogic;

public class LinkedListNode {
	int data = 0;
	LinkedListNode next= null;
	public LinkedListNode() {
		// TODO Auto-generated constructor stub
			this.data = 0;
			this.next = null;
			}
	
	public LinkedListNode(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode node) {
		this.next = node;
	}
	
	
	
	

}

package BusinessLogic;

import java.util.HashSet;
import java.util.LinkedList;


public class MyLinkList {
	
	
	public void deleteDups(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		
		LinkedListNode previous = null;
		while(n!= null) {
			if (set.contains(n.data)){
				previous.next = n.next;
				
			}
			else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
		
		
	}
	
	public void printLinkList(LinkedListNode n) {
		
		while(n!=null) {
			System.out.println("\n The data value for this node is : "+n.data);
			n = n.next;
		}
	}

}


