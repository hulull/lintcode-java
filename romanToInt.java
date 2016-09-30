public class Solution {
	
	public int romanToInt(String s) {
		int ret = 0;
		int cur = 0, pre = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			switch(s.charAt(i)) {
			case 'I':
				cur = 1;
				break;
			case 'V':
				cur = 5;
				break;
			case 'X':
				cur = 10;
				break;
			case 'L':
				cur = 50;
				break;
			case 'C':
				cur = 100;
				break;
			case 'D':
				cur = 500;
				break;
			case 'M':
				cur = 1000;
				break;
			}
			if (i == s.length()-1 || pre <= cur) //注意XX的处理，这里必须是<=
				ret += cur;
			else
				ret -= cur;
			pre = cur;
		}
		return ret;
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
//		System.out.println(solution.romanToInt("IV"));
//		System.out.println(solution.romanToInt("XCIX"));
		System.out.println(solution.romanToInt("DCXXI"));
	}
}
