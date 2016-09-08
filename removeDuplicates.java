public class Solution {
	public int removeDuplicates(int[] nums) {
		int length = nums.length;
		int newLength = length;
		int i = 0, j = i+1;
		while (j <= newLength-1) {
			if (nums[i] == nums[j]) {
				while (j < newLength-1) { //后续元素前移
					nums[j] = nums[++j];
				}
				j = i+1;
				newLength--;  //当最后一个元素和前一个元素重复时，不要前移，直接长度减一
			}
			else {
				++i;
				j = i + 1;
			}
		}
		return newLength;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		int[] A = {1, 1, 1, 2, 2, 2};
		int [] B = {};
		System.out.println(solution.removeDuplicates(A));
	}
}
