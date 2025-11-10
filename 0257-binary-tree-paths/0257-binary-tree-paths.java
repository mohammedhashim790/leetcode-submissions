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

    private List<String> res = new ArrayList();

    private void traverse(TreeNode root, StringBuilder str){

        if(root == null) return ;

        if(root.left==null && root.right == null) {
            str.append(root.val);
            res.add(str.toString());
        }
        else str.append(root.val + "->");

        traverse(root.left, new StringBuilder(str));
        traverse(root.right, new StringBuilder(str));

    }

    public List<String> binaryTreePaths(TreeNode root) {
        traverse(root, new StringBuilder());
        return res;
    }
}