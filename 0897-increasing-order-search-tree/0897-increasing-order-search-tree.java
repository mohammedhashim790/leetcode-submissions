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

    TreeNode node = new TreeNode(-1);

    void traverse(TreeNode root){
        if(root!=null){
            traverse(root.left);
            node.right = new TreeNode(root.val);
            node = node.right;
            node.left = null;
            traverse(root.right);
        }
    }
    public TreeNode increasingBST(TreeNode root) {
        TreeNode res = node;
        traverse(root);
        return res.right;
    }
}