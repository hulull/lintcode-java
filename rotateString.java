public class Solution {
	//时间复杂度o(n),空间复杂度o(n)
	public void rotateString(char[] str, int offset) {
		if (str.length == 0)
			return;
		int realOffset = offset%(str.length);
		if (realOffset == 0) {
			System.out.println(str);
			return;
		}
		char[] rs = new char[str.length];
		int ind, i;
		for (ind = 0, i = str.length-realOffset; i < str.length; i++, ind++) {
			rs[ind] = str[i];
		}
		for (i = 0; ind < str.length; i++, ind++) {
			rs[ind] = str[i];
		}
		for (i = 0; i < rs.length; i++) {
			str[i] = rs[i];
		}
		System.out.println(str);
	}
	//时间复杂度O(n^2)，空间复杂度O(1)
	public void rotateString2(char[] str, int offset) {
		if (str.length == 0)
			return;
		int realOffset = offset % (str.length);
		if (realOffset == 0)
			return;
		char tmp;
		for (int i = 0; i < realOffset; i++) {
			tmp = str[str.length-1];
			for (int j = str.length-1; j >= 1; j--) {
				str[j] = str[j-1];
			}
			str[0] = tmp;
		}
		System.out.println(str);
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		char[] str = {'a','b','c','d','e','f','g'};
		char[] s = {};
		solution.rotateString2(str, 3);
	}
}
