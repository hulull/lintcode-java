public class Solution {
	public int maxSubArray(int[] nums) {
		int thisSum = 0;
		int maxSum = 0;
		
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		if (max < 0)
			return max;
		
		for (int i = 0; i < nums.length; i++) {
			thisSum += nums[i];
			if (thisSum > maxSum) {
				maxSum = thisSum;
			}
			if (thisSum < 0) {
				thisSum = 0;
			}
		}
		return maxSum;
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		int[] nums = {-2, 2, -3, 4, -1, 2, 1, -5, 3};
		System.out.println(solution.maxSubArray(nums));
	}
}
