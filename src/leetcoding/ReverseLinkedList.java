package leetcoding;

public class ReverseLinkedList {
	
	public class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
		}
	}
	
	// create a linked list
	
	public Node reverseLinkedList(Node head){
		Node nextTemp = null;
		Node current = head;
		Node previous = null;
		
		while(current != null){
			nextTemp = current.next;
			current.next = previous;
			previous = current;
			current = nextTemp;
		}
		return previous;
	}
}
