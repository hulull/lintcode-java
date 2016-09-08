public class Solution {
	ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode tmp = head;
		int length = 0;
		while (tmp != null) {
			length++;
			tmp = tmp.next;
		}
		if (length == n)
			return head.next;
		tmp = head;
		for (int i = 1; i < length-n; i++) { //迭代到倒数第n个结点前一个位置
			tmp = tmp.next;
		}
		tmp.next = tmp.next.next;
		return head;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(8);
		ListNode node6 = new ListNode(7);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		System.out.println(solution.removeNthFromEnd(node1, 4).val);
	}
}
