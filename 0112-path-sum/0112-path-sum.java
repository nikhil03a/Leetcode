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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,0, targetSum);
    }
    public boolean helper(TreeNode root, int i, int target){
        if(root==null){
            return false;
        }
        i+=root.val;
        if(i==target && root.left==null && root.right==null){
            return true;
        }else{
            return helper(root.left,i,target)||helper(root.right,i,target);
        }
    }
}