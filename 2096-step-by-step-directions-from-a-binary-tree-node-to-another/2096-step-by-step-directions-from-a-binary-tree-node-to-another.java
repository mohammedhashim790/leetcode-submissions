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

    void inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }

    void preOrder(TreeNode root){
        if(root!=null){
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    

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

        // inOrder(root);
        // System.out.println("*".repeat(10));
        // preOrder(root);

        find(root, p, left);
        find(root, q, right);

        // System.out.println(left);
        // System.out.println(right);


        return "";

        int i = 0, min = Math.min(left.length(), right.length());
        while (i < min && left.charAt(left.length() - i - 1) == right.charAt(right.length() - i - 1)){
            i++;
        }
        // String res = 
        return "U".repeat(left.length() - i) + right.reverse().toString().substring(i);
    }
}