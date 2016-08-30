/**
 * 翻转链表中第m个节点到第n个节点的部分
 * 1 <= m <= n <= 链表长度
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		int k = n - m;
		if (k == 0)
			return head;
		ListNode front = head;
		ListNode rear = head;
		for (int i = 0; i < m-2; i++) {
			front = front.next;  //第m-1个结点
		}
		for (int i = 0; i < n; i++) {
			rear = rear.next;  //第n+1个结点
		}
		ListNode pre = m == 1 ? head : front.next; //第m个结点
		ListNode cur = pre.next; //第m+1个结点
		ListNode next = cur.next; 
		pre.next = rear;
		while (next != null && k > 1) {
			cur.next = pre;
			pre = cur;
			cur = next;
			next = next.next;
			k--;
		}
		cur.next = pre;
		if (m != 1) {
			front.next = cur;
			return head;
		}
		return cur;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		System.out.println(solution.reverseBetween(node1, 2, 4).val);
	}
}
