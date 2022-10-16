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
    public int maxDepth(TreeNode root) {
        int res = 0;
        if(root==null)
            return 0;
        else
            res = depth(root,0);
        return res;
    }
    int ans=0;
    public int depth(TreeNode root, int level){
        if(root==null){
            if(level>ans)
                ans = level;
            return ans;
        }
        int left = depth(root.left,level+1);
        int right = depth(root.right,level+1);
        if(left>right)
            return left;
        else
            return right;
    }
}