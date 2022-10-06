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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode();
        root = null;
        for(int i=0; i<preorder.length; i++){
            root = insert(root,preorder[i]);
        }
        return root;
    }
    TreeNode insert(TreeNode root, int n){
        if(root==null){
            TreeNode temp = new TreeNode();
            temp.val =n;
            temp.left = temp.right = null;
            root = temp;
            return root;
        }
        if(n<root.val){
            root.left = insert(root.left,n);
        }else if(n>root.val){
            root.right = insert(root.right,n);
        }
        return root;
    }
}