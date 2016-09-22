public class Solution {
    public boolean isValidBST(TreeNode root) {
    	return isValid(root, null, null);
    }
    public boolean isValid(TreeNode node, Integer minVal, Integer maxVal) {
    	if (node == null)
    		return true;
    	if ((minVal == null || minVal < node.val) && (maxVal == null || maxVal > node.val))
    		return isValid(node.left, minVal, node.val) && 
    				isValid(node.right, node.val, maxVal);
    	return false;
    }
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		TreeNode n1 = new TreeNode(10);
		TreeNode n2 = new TreeNode(5);
		TreeNode n3 = new TreeNode(15);
		TreeNode n4 = new TreeNode(6);
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		solution.isValidBST(n1);
	}
}
