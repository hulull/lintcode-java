	public void preorderTraversal(TreeNode root) {
		System.out.println(root.val);
		if (root.left != null) //要进行非空判断
			preorderTraversal(root.left);
		if (root.right != null)
			preorderTraversal(root.right);
	}
