public class Solution {
	public ListNode swapNodes(ListNode head, int v1, int v2) {
		ListNode pre = head;
		if (pre == null)
			return null;
		ListNode cur = pre.next;
		if (cur == null)
			return head;
		if (head.val == v1 || head.val == v2) {  //包括头结点
			if (head.val == v1) {
				while (cur != null && cur.val != v2) {
					pre = pre.next;
					cur = cur.next;
				}
				if (cur == null)
					return head;
				if (cur == head.next) { //交换的是前两个结点，v1在前面
					pre.next = cur.next;
					cur.next = pre;
					return cur;
				}
				pre.next = head;
				cur.next = head.next;
				head.next = cur.next;
				return cur;
			}
			if (head.val == v2) {
				while (cur != null && cur.val != v1) {
					pre = pre.next;
					cur = cur.next;
				}
				if (cur == null)
					return head;
				if (cur == head.next) {  //交换的是前两个结点，v2在前面
					pre.next = cur.next;
					cur.next = pre;
					return cur;
				}
				ListNode next = cur.next;
				cur.next = head.next;
				head.next = next;
				pre.next = head;
				return cur;
			}
		}
		ListNode pre1 = null, pre2 = null, cur1 = null, cur2 = null;
		while (cur != null) {
			if (cur.val != v1 && cur.val != v2) {
				pre = pre.next;
				cur = cur.next;
				continue;
			}
			if (cur.val == v1) {
				pre1 = pre;
				cur1 = cur;
				pre = pre.next;
				cur = cur.next;
			}
			else if (cur.val == v2) {
				pre2 = pre;
				cur2 = cur;
				pre = pre.next;
				cur = cur.next;
			}
			if (cur1 != null && cur2 != null)
				break;
		}
		if (cur1 == null || cur2 == null)
			return head;
		if (cur1 == pre2) {  //v1和v2相邻，v1在v2前面
			cur1.next = cur2.next;
			cur2.next = cur1;
			pre1.next = cur2;
			return head;
		}
		if (cur2 == pre1) {  //v1和v2相邻，v2在v1前面
			cur2.next = cur1.next;
			cur1.next = cur2;
			pre2.next = cur1;
			return head;
		}
		//v1和v2不相邻，普通处理
		ListNode next1 = cur1.next;
		ListNode next2 = cur2.next;
		cur1.next = next2;
		cur2.next = next1;
		pre1.next = cur2;
		pre2.next = cur1;
		return head;
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(10);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
//		new Solution().swapNodes(n1, 2, 4);
//		new Solution().swapNodes(n1, 3, 6);
//		new Solution().swapNodes(n5, 10, 10);
		new Solution().swapNodes(n1, 1, 2);
	}
}
