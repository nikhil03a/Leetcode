/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int[] arr = new int[size+1];
        int i = 0;
        while(head!=null){
            arr[i++]=head.val;
            head = head.next;
        }
        int n = i;
        TreeNode temp2= new TreeNode();
        temp2 = insert(temp2,0,--n,arr);
        return temp2;
    }
    
    public TreeNode insert(TreeNode root, int i, int j, int[] arr ){
        if(i>j)
            return null;
        int mid = i + (j-i)/2;
        TreeNode temp = new TreeNode();
        temp.val = arr[mid];
        temp.left = insert(temp.left,i,mid-1,arr);
        temp.right = insert(temp.right,mid+1,j,arr);
        return temp;
    }
}