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

