public class Solution {
	public int removeElement(int[] A, int elem) {
		int length = A.length;
		int j;
		for (int i = 0; i < length;) {
			if (A[i] == elem) {
				j = i + 1;
				A[i] = A[j];
				while (j < length-1) {
					A[j] = A[++j];
				}
				length--;
			}
			else
				i++;
		}
		return length;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		int [] A = {0, 4, 4, 0, 0, 2, 4, 4};
		System.out.println(solution.removeElement(A, 4));
	}
}
