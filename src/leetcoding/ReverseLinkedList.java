package leetcoding;

public class ReverseLinkedList {
	
	public class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	// create a linked list
	
	public void reverseLinkedList(Node myNode){
		Node head = null;
		Node current = myNode;
		Node previous = null;
		
		if(current != null && current.next == null){
			System.out.println("Reversal done");
		}
		
		while(current != null){
			head = myNode;
			current = head.next;
			previous = head;
			current.next = previous;
		}
	}
}
