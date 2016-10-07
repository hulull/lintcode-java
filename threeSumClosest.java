public class Solution {
	
	public int threeSumClosest(int[] numbers, int target) {
		int ret = Integer.MAX_VALUE;
		if (numbers == null || numbers.length < 3)
			return ret;
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length-1; i++) {
			int right = numbers.length-1;
			int left = i+1;
			while (left < right) {
				int sum = numbers[i] + numbers[left] + numbers[right];
				if (sum == target)
					return target;
				else if (sum > target) {
					if (Math.abs(sum-target) < Math.abs(ret-target))
						ret = sum;
					right--;
				}
				else {
					if (Math.abs(sum-target) < Math.abs(ret-target))
						ret = sum;
					left++;
				}
			}
		}
		return ret;
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		int[] A = {1, 2, -1, -4};
		solution.threeSumClosest(A, 1);
	}
}
