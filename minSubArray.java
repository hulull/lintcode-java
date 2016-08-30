public class Solution {
	public int minSubArray(ArrayList<Integer> nums) {
		int thisSum = 0, maxSum = 0;
		int min = nums.get(0);
		for (int i = 1; i < nums.size(); i++) {
			if (min > nums.get(i)) {
				min = nums.get(i);
			}
		}
		if (min >= 0)
			return min;
		
		for (int i = 0; i < nums.size(); i++) {
			thisSum += nums.get(i);
			if (thisSum < maxSum) {
				maxSum = thisSum;
			}
			if (thisSum > 0) {
				thisSum = 0;
			}
		}
		return maxSum;
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(-1);
		nums.add(-2);
		nums.add(1);
		System.out.println(solution.minSubArray(nums));
	}
}
