public class Solution {
	public int maxDepth(TreeNode root) { //获得二叉树的最大深度
		if (root != null)
			return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
		return 0;
	}

	public static void main(String args[]) {
		Solution solution = new Solution();
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(9);
		TreeNode node3 = new TreeNode(20);
		TreeNode node4 = new TreeNode(15);
		TreeNode node5 = new TreeNode(7);
		node1.left = node2;
		node1.right = node3;
		node3.left = node4;
		node3.right = node5;
		System.out.println(solution.maxDepth(node1));
	}
}
