public class Solution {
	public int binarySearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		while (left <= right) {
			int middle = (left+right)/2;
			if (nums[middle] < target) {
				left = middle + 1;
			} else if (nums[middle] > target) {
				right = middle - 1;
			} else {
				while(middle > 0 && nums[middle] == nums[middle-1]) {
					middle--;
				}
				return middle;
			}
		}
		return -1;
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		int[] nums = {4,5,9,9,12,13,14,15,15,18};
		System.out.println(solution.binarySearch(nums, 10));
	}
}
