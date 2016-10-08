public class Solution {
	
		public int[] plusOne(int[] digits) {
			if (digits == null || digits.length == 0)
				return digits;
			int carry = 0;
			int tmp = digits[digits.length-1] + 1;
			if (tmp >= 10) {
				digits[digits.length-1] = tmp-10;
				carry = 1;
			}
			else {
				digits[digits.length-1] = tmp;
				return digits;
			}
			//如果在for循环中没有返回，那么一直进位
			for (int i = digits.length-2; i >= 0; i--) {
				int sum = digits[i] + carry;
				if (sum >= 10) {
					digits[i] = sum - 10;
					carry = 1;
				}
				else {
					digits[i] = sum;
					return digits;
				}
			}
			int[] newDigits = new int[digits.length+1];
			newDigits[0] = 1;
			for (int i = 1; i < newDigits.length; i++)
				newDigits[i] = digits[i-1];
			return newDigits;
		}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		int[] a = {9, 9, 9};
		System.out.println(solution.plusOne(a));
	}
}
