public class Solution {
	
	public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		if (numbers == null || numbers.length < 3)
			return ret;
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length-1; i++) {
			int right = numbers.length-1;
			int left = i + 1;
			while (left < right) {
				int sum = numbers[left] + numbers[i] + numbers[right];
				if (sum == 0) {
					ArrayList<Integer> tmp = new ArrayList<Integer>();
					tmp.add(numbers[i]);
					tmp.add(numbers[left]);
					tmp.add(numbers[right]);
					if (!ret.contains(tmp)) 
						ret.add(tmp);
					left++;
					right--;
				}
				else if (sum > 0) {
					right--;
				}
				else 
					left++;
			}
		}
		return ret;
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		int[] A = {-1, 0, 1, 2, -1, -4};
		int[] B = {1, 0, -1, -1, -1, -1, 0, 1, 1, 1};
		int[] C = {-2, -3, 5, -1, -4, 5, -11, 7, 1, 2, 3, 4, -7, -1, -2, -3, -4, -5};
		int[] D = {-1, 1, 0};
//		solution.threeSum(A);
//		solution.threeSum(B);
//		solution.threeSum(C);
		solution.threeSum(D);
	}
}
