public class Main {

	public int longestCommonSubstring(String A, String B) {
		int lenA = A.length();
		int lenB = B.length();
		if (A == null || B == null || lenA == 0 || lenB == 0)
			return 0;
		int len = 0;
		int[][] rst = new int[lenA+1][lenB+1];
		for (int i = 1; i <= lenA; i++) {
			for (int j = 1; j <= lenB; j++) {
				int a = A.charAt(i-1);
				int b = B.charAt(j-1);
				if (a == b) {
					rst[i][j] = rst[i-1][j-1]+1;
					len = max(len, rst[i][j]);
				}
				else
					rst[i][j] = 0;
			}
		}
		return len;
	}
	
	public int max(int a, int b) {
		return a > b ? a : b;
	}
	/*
	 * 测试用例：
	 * 1.数组长度为0
	 * 2.普通数组
	 * 3.有相等元素的数组
	 */
	public static void main(String[] args) {
		Main m1 = new Main();
		String s1 = "ABCD";
		String s2 = "ABDE";
		System.out.println(m1.longestCommonSubstring(s1, s2));
	}
}
