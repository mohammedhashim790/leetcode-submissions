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
    

    public int goodNodes(TreeNode root) {
        
        Queue<Object[]> q = new LinkedList<Object[]>();
        List<Integer> nums = new ArrayList<Integer>();

        q.offer(new Object[]{root, Integer.MIN_VALUE});


        while(!q.isEmpty()){
            for(int i =0 ; i<q.size();i++){
                Object[] obj = q.poll();
                int max = (int) obj[1];
                TreeNode node = (TreeNode) obj[0];

                if(node.val >= max){
                    nums.add(node.val);
                    max = node.val;
                }

                if(node.left!=null) q.offer(new Object[]{node.left,max});
                if(node.right!=null) q.offer(new Object[]{node.right,max});

            }

        }

        return nums.size();
    }

    // public void traverse(TreeNode root, int max){
    //     if(root == null) return;
    //     if(root.val >= max) {
    //         count++;
    //         max = root.val;
    //     }
    //     traverse(root.left, max);
    //     traverse(root.right, max);
    // }
    // public int goodNodes(TreeNode root) {
    //     traverse(root, Integer.MIN_VALUE);
    //     return count;
    // }
}