public class Solution {
	public boolean isUgly(int num) {
		if (num == 0)
			return false;
		int tmp = num;
		while (tmp % 2 == 0) {
			tmp /= 2;
		}
		while (tmp % 3 == 0) {
			tmp /= 3;
		}
		while (tmp % 5 == 0) {
			tmp /= 5;
		}
		if (tmp == 1)
			return true;
		return false;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		System.out.println(solution.isUgly(1));
		System.out.println(solution.isUgly(6));
		System.out.println(solution.isUgly(14));
		System.out.println(solution.isUgly(1500));
	}
}
