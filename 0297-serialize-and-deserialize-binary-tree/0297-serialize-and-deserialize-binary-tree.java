/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    int pre = 0;
    void serialize(TreeNode root, List<String> nums){
        if(root == null){
            nums.add("N");return;
        }

        nums.add(String.valueOf(root.val));
        serialize(root.left, nums);
        serialize(root.right, nums);
        
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> nums = new ArrayList<String>();
        serialize(root, nums);
        System.out.println(nums);
        return String.join(",", nums);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nums = data.split(",");
        return deserialize(nums);
    }

    TreeNode deserialize(String[] data){
        if(data[pre].equals("N")){
            pre++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(data[pre]));
        pre++;

        node.left = deserialize(data);
        node.right = deserialize(data);

        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));