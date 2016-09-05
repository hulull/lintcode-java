public class Solution {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if (root == null)
			return rst;
		TreeNode tmp = root;
		q.offer(tmp);
		while (!q.isEmpty()) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int length = q.size();
			for (int i = 0; i < length; i++) { //q的长度一直在变化，应该先用length记录下来
				tmp = q.poll();
				if (tmp.left != null) {
					q.offer(tmp.left);
				}
				if (tmp.right != null) {
					q.offer(tmp.right);
				}
				list.add(tmp.val);
			}
			rst.add(list);
		}
		return rst;
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
		System.out.println(solution.levelOrder(node1));
	}
}
