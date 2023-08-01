
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
        TreeNode pre;

        while (current != null) {
            if (current.left == null) {
                output.add(current.val);
                current = current.right;
            } else {
                // Find the inorder predecessor of the current node
                pre = current.left;
                while (pre.right != null && pre.right != current) {
                    pre = pre.right;
                }

                if (pre.right == null) {
                    // Make the current node the right child of the inorder predecessor
                    pre.right = current;
                    current = current.left;
                } else {
                    // Revert the changes made in the if block
                    pre.right = null;
                    output.add(current.val);
                    current = current.right;
                }
            }
        }

        return output;
    }
}
