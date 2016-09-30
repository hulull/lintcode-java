public class Solution {
	
	public boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		if (head.next == null)
			return false;
		ListNode p1 = head;
		ListNode p2 = head.next;
		while (p1 != null && p2 != null) {
			if (p1 == p2)
				return true;
			p1 = p1.next; //p1每次走1步
			if (p2.next == null)  //p2每次走2步
				return false;
			else
				p2 = p2.next.next;
		}
		return false;
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		solution.hasCycle(null);
	}
}
