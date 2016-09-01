public class Solution {
	//前序遍历-递归
	public void preorderTraversal(TreeNode root) {
		if (root != null) {  //要进行非空判断
			System.out.print(root.val+" ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	//前序遍历-非递归
	public ArrayList<Integer> preorderTraversal2(TreeNode root) {
		ArrayList<Integer> rst = new ArrayList<Integer>(); //当root==null时，返回[]
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode tmp = root;
		while (tmp != null || !stack.isEmpty()) {
			while (tmp != null) {
				rst.add(tmp.val);
				stack.push(tmp);
				tmp = tmp.left;
			}
			if (!stack.isEmpty()) {
				tmp = stack.peek();
				stack.pop();
				tmp = tmp.right;
			}
		}
		return rst;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		node1.right = node2;
		node2.left = node3;
		System.out.println(solution.preorderTraversal2(node1));
		solution.preorderTraversal(node1);
	}
}

