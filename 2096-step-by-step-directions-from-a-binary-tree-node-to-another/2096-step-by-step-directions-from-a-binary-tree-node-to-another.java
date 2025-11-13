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

    public boolean find(TreeNode root, int val, StringBuilder str){
        if(root.val == val) return true;

        if(root.left!=null && find(root.left, val, str)){
            str.append(String.valueOf("L" ));
            // + root.val + "->"
        }
        else if(root.right!=null && find(root.right, val, str)){
            str.append(String.valueOf("R" ));
            // + root.val + "->"
        }

        return str.length() > 0;
    }
    public String getDirections(TreeNode root, int p, int q) {
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        find(root, p, left);
        find(root, q, right);

        System.out.println(left);
        System.out.println(right);


        // return "";

        int i = 0, min = Math.min(left.length(), right.length());
        while (i < min && left.charAt(left.length() - i - 1) == right.charAt(right.length() - i - 1)){
            i++;
        }
        // String res = 
        return "U".repeat(left.length() - i) + right.reverse().toString().substring(i);
    }
}