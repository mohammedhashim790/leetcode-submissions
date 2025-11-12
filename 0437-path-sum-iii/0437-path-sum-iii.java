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


    int traverse(TreeNode root, Map<Long, Integer> map, long sum, int target){
        if(root == null) return 0;

        sum+=root.val;

        int count = map.getOrDefault(sum - target, 0);

        map.put(sum, map.getOrDefault(sum, 0) + 1);
        count+= traverse(root.left,map, sum , target);
        count+= traverse(root.right,map, sum , target);

        // map.put(sum, map.get(sum) - 1);
        

        return count;
    }

    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        map.put(0L, 1);
        
        int res = traverse(root, map, 0, targetSum);
        System.out.println(map);

        return res;

    }
}