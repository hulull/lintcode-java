public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int[] ret = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			int x = target-numbers[i];
			for (int j = i+1; j < numbers.length; j++) {
				if (x == numbers[j]) {
					ret[0] = i+1;
					ret[1] = j+1;
					break;
				}
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		
	}
}
