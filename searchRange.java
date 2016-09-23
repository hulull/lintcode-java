public class Solution {
    /**
     * @param root: The root of the binary search tree.
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in ascending order.
     */
    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
		ArrayList<Integer> inOrder = inOrderTraversal(root);
		ArrayList<Integer> ret = new ArrayList<Integer>();
		if (root==null)
		    return ret;
		for (int i = 0; i < inOrder.size(); i++) {
			if (inOrder.get(i) <= k2 && inOrder.get(i) >= k1)
				ret.add(inOrder.get(i));
		}
		return ret;
	}
	
	public ArrayList<Integer> inOrderTraversal(TreeNode root) {
		ArrayList<Integer> inOrder = new ArrayList<Integer>();
		if (root == null)
			return null;
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode tmp = root;
		while (tmp != null || !s.isEmpty()) {
			while (tmp != null) {
				s.push(tmp);
				tmp = tmp.left;
			}
			if (!s.isEmpty()) {
				tmp = s.peek();
				inOrder.add(tmp.val);
				s.pop();
				tmp = tmp.right;
			}
		}
		return inOrder;
	}
}
