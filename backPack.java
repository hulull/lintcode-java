public class Main {

	public int backPack(int m, int[] A) {
		if (m <= 0 || A == null || A.length == 0)
			return 0;
		Arrays.sort(A);
		int len = A.length;
		int rst = 0;
		int[] sums = new int[len];
		for (int i = len-1; i > 0; i--) {
			if (A[i] > m) {
				sums[i] = 0;
				continue;
			}
			sums[i] = A[i];
			for (int j = i-1; j >= 0; j--) {
				if (sums[i] + A[j] <= m) {
					sums[i] = sums[i] + A[j];
				}
			}
			rst = max(rst, sums[i]);
		}
		return rst;
	}
	public int max(int a, int b) {
		return a > b ? a : b;
	}
	/*
	 * 测试用例：
	 * 1.数组长度为0
	 * 2.普通数组
	 * 3.有些物品重量超过背包称重
	 */
	public static void main(String[] args) {
		int[] A = {20, 15, 15, 15, 7, 2};
		Main m1 = new Main();
		System.out.println(m1.backPack(10, A));
		System.out.println(m1.backPack(12, A));
	}
}
