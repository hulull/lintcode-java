public class Solution {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	public boolean isBalanced(TreeNode root) { //递归
		if (root == null)
			return true;
		int leftHeight, rightHeight;
		leftHeight = maxDepth(root.left);
		rightHeight = maxDepth(root.right);
		if (Math.abs(leftHeight-rightHeight) <= 1)
			return isBalanced(root.left) && isBalanced(root.right);
		return false;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(9);
		TreeNode node3 = new TreeNode(20);
//		TreeNode node4 = new TreeNode(15);
//		TreeNode node5 = new TreeNode(7); 
		node1.right = node2;
		node2.right = node3;
		System.out.println(solution.isBalanced(node1));
	}
}
