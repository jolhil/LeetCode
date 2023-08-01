
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(current != null || !stack.empty()) {
            while(current!= null) {
                stack.add(current);
                current = current.left;
            }
            current = stack.pop();
            output.add(current.val);
            current = current.right;
        }

        return output;
    }
}
