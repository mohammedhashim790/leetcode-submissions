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

    int max = 0;
    // public void traverse(TreeNode root, int counter){

    //     if(root == null) return;

    //     int left = (root.left!=null && root.left.val == root.val)? counter+1:0;

    //     int right = (root.right!=null && root.right.val == root.val)? counter+1:0;
    //     if(left!=0 && right!=0){
    //         max = Math.max(left+right, max);
    //     }else if(max < left || max < right){
    //         max = Math.max(left, right);
    //     }
    
    //     System.out.println("Val : " + root.val + " Left : " + left + " Right : " + right + " Max : " + max);

    //     traverse(root.left, left);
    //     traverse(root.right, right);

    // }

    public int traverse(TreeNode root, int parent){
        if(root == null) return 0;

        int left = traverse(root.left, root.val);
        int right = traverse(root.right, root.val);

        max = Math.max(max, left+right);
        if(root.val == parent) return Math.max(left,right) + 1;

        return 0;
    }
    public int longestUnivaluePath(TreeNode root) {
        traverse(root, -1);
        return max;
    }
}