public class Solution {
	public boolean isHappy(int n) {
		if (n <= 0)
			return false;
		int curNum = n;
		int nextNum;
		while (true) {
			nextNum = getNextNum(curNum);
			if (nextNum == 1) {
				return true;
			}
			if (nextNum == 89) {
				return false;
			}
			curNum = nextNum;
		}
	}
	public int getNextNum(int n) {
		int nextNum = 0;
		while (n/10 > 0) {
			nextNum += (n % 10) * (n %10);
			n /= 10;
		}
		nextNum += (n % 10) * (n %10);
		return nextNum;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		System.out.println(solution.isHappy(19));
		System.out.println(solution.isHappy(0));
		System.out.println(solution.isHappy(1));
		System.out.println(solution.isHappy(100009));
	}
}
