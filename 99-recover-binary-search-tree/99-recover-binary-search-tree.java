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
    List<Integer> list1 = new ArrayList<>();
    List<TreeNode> list2 = new ArrayList<>();
    public void recoverTree(TreeNode root) {
        int i=0;
        inorder(root);
        Collections.sort(list1);
        for(i=0; i<list1.size(); i++){
                list2.get(i).val = list1.get(i);
        }
        return;
    }
    public void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        list1.add(root.val);
        list2.add(root);
        inorder(root.right);
    }
    // public void inorder2(TreeNode root, int i, int j){
    //     if(root==null)
    //         return;
    //     inorder(root.left);
    //     if(root.val==i){
    //         root.val = j;
    //     }else if(root.val==j){
    //         root.val = i;
    //     }
    //     inorder(root.right);
    // }
}
