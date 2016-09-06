public class Solution {
	public int minDepth(TreeNode root) { //获得二叉树的最小深度（根节点到最近叶子节点的距离）
		if (root == null)
			return 0;
		if (root.left == null)
			return 1 + minDepth(root.right);
		if (root.right == null)
			return 1 + minDepth(root.left);
		return 1 + Math.min(minDepth(root.left), minDepth(root.right)); 
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
		System.out.println(solution.minDepth(node1));
	}
}
