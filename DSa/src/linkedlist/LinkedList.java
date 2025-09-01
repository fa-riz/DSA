package linkedlist;


class Node {
	
	int data;
	Node next;
	
		public Node(int data) {
			this.data= data;
			this.next = null;
		
	
	}
	
}
public class LinkedList {
	
	Node head;
	public void add(int data) {
		Node newNode = new Node(data);

		if(head == null) {
			head = newNode;
		}
		else {
			Node current = head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void addFirst(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head= newNode;
		}
		else {
			newNode.next=head;
			head = newNode;
		}
		
	}
	public void printList() {
	    Node current = head;
	    while (current != null) {
	        System.out.print(current.data + " -> ");
	        current = current.next;
	    }
	    System.out.println("null");
	}


}
