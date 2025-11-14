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

    int idx = 0;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    TreeNode buildTree(int[] pre, int l, int r){
        if(l > r ) return null;

        int val = pre[idx++];
        TreeNode root = new TreeNode(val);
        // index of inorder
        int mid = map.get(val);

        root.left = buildTree(pre, l, mid-1);
        root.right = buildTree(pre, mid+1, r);

        return root;
    }

    public TreeNode buildTree(int[] pre, int[] in) {
        for(int i = 0 ;i<in.length;i++){
            map.put(in[i] , i);
        }
        return buildTree(pre, 0, pre.length-1);
    }
}