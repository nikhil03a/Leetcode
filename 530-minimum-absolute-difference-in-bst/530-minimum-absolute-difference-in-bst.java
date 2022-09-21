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
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        for(int i=0; i<list.size()-1; i++){
            if((list.get(i+1)-list.get(i))<min)
                min = (list.get(i+1)-list.get(i));
        }
        return min;
    }
    int min = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<>();
    public void helper(TreeNode root){
        if(root!=null){
            helper(root.left);
            list.add(root.val);
            helper(root.right);
        }
    }
}