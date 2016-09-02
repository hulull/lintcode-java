public class Solution {
    public void inorderTraversal2(TreeNode root) { //递归
          if (root != null) {
                inorderTraversal2(root.left);
                System.out.print(root.val + " ");
                inorderTraversal2(root.right);
          }
    }
    
    public ArrayList<Integer> inorderTraversal(TreeNode root) {  //非递归
          ArrayList<Integer> rst = new ArrayList<Integer>();
          Stack<TreeNode> stack = new Stack<TreeNode>();
          TreeNode tmp = root;
          while (tmp != null || !stack.isEmpty()) {
                while (tmp != null) {
                      stack.push(tmp);
                      tmp = tmp.left;
                }
                if (!stack.isEmpty()) {
                      tmp = stack.peek();
                      rst.add(tmp.val);
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
          System.out.println(solution.inorderTraversal(node1));
          solution.inorderTraversal2(node1);
    }
}
