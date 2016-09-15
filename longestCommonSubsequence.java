public class Main {
	
	public int longestCommonSubsequence(String A, String B) {
		int lenA = A.length();
		int lenB = B.length();
		if (A == null || B == null || lenA == 0 || lenB == 0)
			return 0;
		int[][] d = new int[lenA+1][lenB+1];
		for (int i = 1; i <= lenA; i++) {
			for (int j = 1; j <= lenB; j++) {
				int a = A.charAt(i-1);
				int b = B.charAt(j-1);
				if (a == b)
					d[i][j] = d[i-1][j-1]+1;
				else
					d[i][j] = Math.max(d[i-1][j], d[i][j-1]);
			}
		}
		return d[lenA][lenB];
	}
	/*
	 * 测试用例：
	 * 1.A为null或者A.length() == 0
	 * 2.普通字符串
	 */
	public static void main(String[] args) {
		Main m = new Main();
		String A = "ABC";
		String B = "ACEFGBC";
		System.out.println(m.longestCommonSubsequence(A, B));
	}
}
