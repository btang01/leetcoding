package leetcoding;

public class MergeSortedListNodes {
	
	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode resultListNode = new ListNode(0);
		
		ListNode dummyHead = resultListNode;
		
		if(l1 == null){
			return l2;
		}
		
		if(l2 == null){
			return l1;
		}
		
		while(l1 != null || l2 != null){
			if(l2 == null || (l1!=null && l1.val <= l2.val)){
				dummyHead.next = new ListNode(l1.val);
				dummyHead = dummyHead.next;
				l1 = l1.next;
			} else {
				dummyHead.next = new ListNode(l2.val);
				dummyHead = dummyHead.next;
				l2 = l2.next;
			}
		}
		
		return resultListNode.next;
		
	}
}
