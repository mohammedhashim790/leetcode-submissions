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

    // the lowest will be the root of the tree
    int max = 0;
    public int traverse(TreeNode root){
        if(root == null) return 0;


        int left = traverse(root.left);
        int right = traverse(root.right);

        // left and right can have negatives, avoid negatives for maximum path sum
        int lMax = Math.max(left, 0);
        int rMax = Math.max(right, 0);

        max = Math.max(root.val + lMax + rMax, max);

        return root.val + Math.max(lMax, rMax);


    }

    public int maxPathSum(TreeNode root) {
        max = root.val;
        traverse(root);
        return max;   
    }
}