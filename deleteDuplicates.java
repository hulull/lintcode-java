public class Solution {
	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		ListNode cur = head, next = head.next;
		if (next == null)
			return head;
		while (next != null) {
			if (cur.val == next.val) {
				next = next.next;
				cur.next = next;
			}
			else {
				next = next.next;
				cur = cur.next;
			}
		}
		return head;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		ListNode node6 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		System.out.println(solution.deleteDuplicates(node1).val);
	}
}
