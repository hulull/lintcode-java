public class Solution {
	
	public ArrayList<ArrayList<Integer>> fourSum(int[] numbers, int target) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		if (numbers == null || numbers.length < 4)
			return ret;
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length-1; j++) {
				int left = j+1;
				int right = numbers.length-1;
				while (left < right) {
					int sum = numbers[i]+numbers[j]+numbers[left]+numbers[right];
					if (sum == target) {
						ArrayList<Integer> tmp = new ArrayList<>();
						tmp.add(numbers[i]);
						tmp.add(numbers[j]);
						tmp.add(numbers[left]);
						tmp.add(numbers[right]);
						if (!ret.contains(tmp))
							ret.add(tmp);
						left++;
						right--;
					}
					else if (sum > target)
						right--;
					else 
						left++;
				}
			}
		}
		return ret;
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		int[] A = {1, 2, -1, -4};
		solution.fourSum(A, -2);
	}
}
