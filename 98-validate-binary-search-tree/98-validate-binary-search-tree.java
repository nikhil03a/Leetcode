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
    // List<Integer> list = new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
        // inorder(root);
        // for(int i=0; i<list.size()-1; i++){
        //     if(list.get(i+1)<=list.get(i)){
        //         return false;
        //     }
        // }
        // return true;
        return dfs(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    // public void inorder(TreeNode root){
    //     if(root==null)
    //         return;
    //     inorder(root.left);
    //     list.add(root.val);
    //     inorder(root.right);       
    // }
    public boolean dfs(TreeNode root, long max, long min){
        if(root==null)
            return true;
        if(!(root.val<max && root.val>min))
            return false;
        return dfs(root.left,root.val, min) && dfs(root.right, max, root.val);
    }
}