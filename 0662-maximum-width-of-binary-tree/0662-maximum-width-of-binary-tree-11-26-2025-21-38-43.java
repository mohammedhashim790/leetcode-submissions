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
    int res = 0;

    public int widthOfBinaryTree(TreeNode root) {

        Queue<Pair<TreeNode, Integer>> q = new LinkedList();
        int res = 0;
        q.add(new Pair(root, 0));
        int level = 0;

        while(!q.isEmpty()){
            int size = 0 ;
            int s = 0, e = 0;
            int l = q.size();

            for(int i = 0 ; i < l ; i++){
                Pair<TreeNode, Integer> pair = q.poll();
                TreeNode node = pair.getKey();
                int index = pair.getValue();
                if(i == 0) s = index;
                if(i == l - 1) e = index;
                if(node.left != null)
                    q.add(new Pair(node.left, 2 * index + 1));
                if(node.right != null)
                    q.add(new Pair(node.right, 2 * index + 2));
            }

            res = Math.max(res, e - s + 1);
            level++;
        }

        return res;
    }
}