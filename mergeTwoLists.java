public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode rst, tmp, tmp1 = l1, tmp2 = l2;
		if (tmp1.val < tmp2.val) {
			tmp = tmp1;
			tmp1 = tmp1.next;
		}
		else {
			tmp = tmp2;
			tmp2 = tmp2.next;
		}
		rst = tmp;
		while (tmp1 != null && tmp2 != null) {
			if (tmp1.val < tmp2.val) {
				tmp.next = tmp1;
				tmp = tmp.next;
				tmp1 = tmp1.next;
			}
			else {
				tmp.next = tmp2;
				tmp = tmp.next;
				tmp2 = tmp2.next;
			}
		}
		if (tmp1 != null) {
			tmp.next = tmp1;
		}
		if (tmp2 != null) {
			tmp.next = tmp2;
		}
		return rst;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(8);
		ListNode node4 = new ListNode(11);
		ListNode node5 = new ListNode(15);
		ListNode node6 = new ListNode(2);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		System.out.println(solution.mergeTwoLists(node1, node6).val);
		System.out.println(solution.mergeTwoLists(null, node1).val);
	}
}
