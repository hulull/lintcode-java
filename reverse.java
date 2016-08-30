/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
	public ListNode reverse(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		ListNode pre, cur, next;
		pre = head;
		cur = pre.next;
		next = cur.next;

		pre.next = null;
		while (next != null) {
			cur.next = pre;
			pre = cur; 
			cur = next;
			next = next.next;
		}
		cur.next = pre;
		return cur;
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		ListNode node1 = new ListNode(0);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		System.out.println(solution.reverse(node1).val);
		System.out.println(solution.reverse(null));
	}
}
