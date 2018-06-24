package Master;

import BusinessLogic.LinkedListNode;
import BusinessLogic.MyLinkList;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode node = new LinkedListNode(2);
		LinkedListNode head = node;
		
		node.setNext(new LinkedListNode(8));
		node = node.getNext();
		node.setNext(new LinkedListNode(3));
		node = node.getNext();
		node.setNext(new LinkedListNode(7));
		node = node.getNext();
		node.setNext(new LinkedListNode(3));
		node = node.getNext();
		node.setNext(new LinkedListNode(8));
		node = node.getNext();
		node.setNext(new LinkedListNode(4));
		node = node.getNext();
		node.setNext(new LinkedListNode(6));
		
		MyLinkList mll = new MyLinkList();
		//mll.deleteDups(head); //Method - 1 Using hashtable
		mll.deleteDuplicates(head);
		mll.printLinkList(head); 
		
		
	}
	
	

}


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


