public class Solution {
	
	public int reverseInteger(int n) {
		int ret = 0;
		while (n / 10 != 0) {
			ret = ret * 10 + n % 10;
			n = n / 10;
		}
		ret = ret * 10 + n % 10;
		if ((ret > 0 && ret > Integer.MAX_VALUE/10) || 
				(ret < 0 && ret < Integer.MIN_VALUE/10))
			return 0;
		return ret;
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
//		System.out.println(solution.reverseInteger(123));
//		System.out.println(solution.reverseInteger(-123));
		System.out.println(solution.reverseInteger(-1534236469));
	}
}
