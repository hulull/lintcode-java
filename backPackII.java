public class Main {
	
	public int backPackII(int m, int[] A, int V[]) {
		if (m <= 0 || A == null || V == null || A.length == 0 || V.length == 0)
			return 0;
		int lenV = V.length;
		int[][] f = new int[lenV+1][m+1];
		for (int i = 1; i <= lenV; i++) {  //i代表物品编号
			for (int j = 1; j <= m; j++) { //j代表称重，0-m
				if (A[i-1] <= j) {
					f[i][j] = Math.max(f[i-1][j], V[i-1]+f[i-1][j-A[i-1]]);
				}
				else
					f[i][j] = f[i-1][j];
			}
		}
		return f[lenV][m];
	}
	public static void main(String[] args) {
//		String A = "ABCDE";
//		String B = "ABDE";
//		int[] C = {7, 5, 8, 2, 9};
		Main m1 = new Main();
		int[] w = {2, 1, 3, 2};
		int[] v = {12, 10, 20, 15};
		int m = 5;
		System.out.println(m1.backPackII(m, w, v));
	}
}
