public class Main {

	public int longestRiseSubsequence(int[] nums) {
		if (nums.length == 0)
			return 0;
		int[] LIS = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			LIS[i] = 1;
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i] && LIS[j] + 1 > LIS[i]) //nums[i]作为序列的最后一个元素，比它前面的所有元素都大
					LIS[i] = LIS[j] + 1;
			}
		}
		return max(LIS);
	}
	
	public int max(int[] nums) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i])
				max = nums[i];
		}
		return max;
	}
	/*
	 * 测试用例：
	 * 1.数组长度为0
	 * 2.普通数组
	 * 3.有相等元素的数组
	 */
	public static void main(String[] args) {
		
	}
}
