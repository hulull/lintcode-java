public class Solution {
	public void invertBinaryTree(TreeNode root) {
		if (root != null) {
			if (root.left != null && root.right != null) {
				TreeNode tmp = root.left;
				root.left = root.right;
				root.right = tmp;
			}
			else if (root.left != null) {
				root.right = root.left;
				root.left = null;
			}
			else if (root.right != null) {
				root.left = root.right;
				root.right = null;
			}
			invertBinaryTree(root.left);
			invertBinaryTree(root.right);
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
	}
}
