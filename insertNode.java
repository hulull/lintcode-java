class TreeNode {
	int val;
	TreeNode left, right;
	public TreeNode(int val) {
		this.val = val;
		this.left = this.right = null;
	}
}
public class Main {
	public TreeNode insertNode(TreeNode root, TreeNode node) {
		if (root == null && node == null)
			return null;
		if (root == null)
			return node;
		if (node == null)
			return root;
		TreeNode tmp = root;
		while (node.val != tmp.val) {
			if (node.val < tmp.val) {
				if (tmp.left == null) {
					tmp.left = node;
					return root;
				}
				else {
					tmp = tmp.left;
				}
			}
			else if (node.val > tmp.val) {
				if (tmp.right == null) {
					tmp.right = node;
					return root;
				}
				else {
					tmp = tmp.right;
				}
			}
		}
		return root;
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(6);
		node1.left = node2;
		node1.right = node3;
		node3.left = node4;
		Main m1 = new Main();
		m1.insertNode(node1, node5);
	}
}
