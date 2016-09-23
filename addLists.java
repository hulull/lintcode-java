public class Solution {
	public ListNode addLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		int carry = 0;
		ListNode l = null;
		if (l1.val+l2.val < 10) {
			l = new ListNode(l1.val+l2.val);
		}
		else {
			l = new ListNode(l1.val+l2.val-10);
			carry = 1;
		}
		l1 = l1.next;
		l2 = l2.next;
		ListNode ret = l;  
		//l = l.next;  注意，这句是错误的，因为赋值了之后就是null了，即使循环里改成l = new... 也不能继续往下迭代
		while (l1 != null && l2 != null) {
			if (l1.val+l2.val+carry < 10) {
				l.next = new ListNode(l1.val+l2.val+carry);
				carry = 0;
			}
			else {
				l.next = new ListNode(l1.val+l2.val+carry-10);
				carry = 1;
			}
			l1 = l1.next;
			l2 = l2.next;
			l = l.next;
		}
		if (l1 != null) {
			if (carry == 0)
				l.next = l1;
			else {
				l.next = new ListNode(l1.val+carry);
				l = l.next;
				l.next = l1.next;
				carry = 0;
			}
		}
		if (l2 != null) {
			if (carry == 0)
				l.next = l2;
			else {
				l.next = new ListNode(l2.val+carry);
				l = l.next;
				l.next = l2.next;
				carry = 0;
			}
		}
		if (carry == 1) {  //注意carry==1的情况
			l.next = new ListNode(carry);
		}
		return ret;
	}
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(9);
		ListNode n5 = new ListNode(9);
		ListNode n6 = new ListNode(8);
		n1.next = n2;
		n2.next = n3;
		
		n4.next = n5;
		n5.next = n6;
		new Solution().addLists(n1, n4);
	}
}
