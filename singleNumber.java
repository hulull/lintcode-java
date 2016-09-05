public class Solution {
	public int singleNumber(int[] A) {
		int single = 0;
		for (int i = 0; i < A.length; i++) {
			single ^= A[i]; 
		}
		return single;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		int[] A = {1, 1, 2, 2, 3, 4, 3};
		System.out.println(solution.singleNumber(A));
	}
}
