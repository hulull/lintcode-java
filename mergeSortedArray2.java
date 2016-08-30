/**
 * 合并两个排序的整数数组A和B变成一个新的数组
 * A具有足够的空间（A数组的大小大于或等于m+n）去添加B中的元素，A中有m个元素，B中有n个元素
 */
public class Solution {
	public void mergeSortedArray(int[] A, int m, int[] B, int n) {
		int tmpA = m-1;
		int tmpB = n-1;
		int ind = 1;
		while (tmpA >= 0 && tmpB >= 0) { //注意这里的判断条件是大于等于0
			if (A[tmpA] > B[tmpB]) {
				A[m+n-ind] = A[tmpA];
				tmpA--; 
				ind++;
			} 
			else {
				A[m+n-ind] = B[tmpB];
				tmpB--;
				ind++;
			}
		}
		while (tmpA >= 0) {
			A[m+n-ind] = A[tmpA];
			tmpA--;
			ind++;
		}
		while (tmpB >= 0) {
			A[m+n-ind] = B[tmpB];
			tmpB--;
			ind++;
		}
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		int[] A = new int[5];
		A[0] = 1;
		A[1] = 3;
		A[2] = 5;
		int[] B = {2, 4};
		solution.mergeSortedArray(A, 3, B, 2);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}
}
