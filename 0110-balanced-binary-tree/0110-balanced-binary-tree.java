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
    public boolean isBalanced(TreeNode root) {
        int temp = dfs(root);
        if(ans==1)
            return true;
        else
            return false;
    }
    int ans = 1;
    public int dfs(TreeNode root){
        if(root==null)
            return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        if(Math.abs(left-right)>1){
            ans = 0;
        }
        if(left==0)
            return right+1;
        else if(right==0)
            return left+1;
        else if(left>right)
            return left+1;
        else
            return right+1;
    }
}