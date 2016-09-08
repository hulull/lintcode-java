public class Solution {
	public int climbStairs(int n) {
		if (n == 0 || n == 1)
			return 1;
		int cur = 1, next = 1;
		int rst = 0;
		for (int i = 1; i < n; i++) {
			rst = cur + next;
			next = cur;
			cur = rst;
		}
		return rst;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		System.out.println(solution.climbStairs(8));
	}
}
