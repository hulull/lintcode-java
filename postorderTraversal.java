public class Solution {
    public void preorderTraversal2(TreeNode root) { //递归
        if (root != null) {
            preorderTraversal2(root.left);
            preorderTraversal2(root.right);
            System.out.print(root.val + " ");
        }
    }

	public ArrayList<Integer> postorderTraversal(TreeNode root) { //非递归
		ArrayList<Integer> rst = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode pre, cur;
		pre = cur = root;
		if (cur != null)
			stack.push(cur);
		while (!stack.isEmpty()) {
			cur = stack.peek();
			if (cur.left == null && cur.right == null || cur.left == pre || cur.right == pre) {
				rst.add(cur.val);
				stack.pop();
				pre = cur;
			} 
			else {
				if (cur.right != null) {
					stack.push(cur.right);
				}
				if (cur.left != null) {
					stack.push(cur.left);
				}
			}
		}
		return rst;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		node1.left = node2;
		node1.right = node3;
		solution.preorderTraversal2(node1);
		System.out.println();
		System.out.println(solution.postorderTraversal(node1));
	}
}
