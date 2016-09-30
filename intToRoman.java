public class Solution {

	public String intToRoman(int n) {
		String ret = "";
		int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		for (int i = 0; i < nums.length;) {
			if (n >= nums[i]) {
				ret += roman[i];
				n -= nums[i];
			}
			else 
				i++;
		}
		return ret;
	}


	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.intToRoman(3842));
	}
}
