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
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int n = 0;
        ListNode node = head;
        while(node!=null){
            node = node.next;
            n++;
        }
        node = head;
        int[] ans = new int[n];
        int i = 0;
        ListNode node2 = head;
        while(node!=null){
            node2 = node.next;
            while(node2!=null){
                if(node.val<node2.val){
                    ans[i]=node2.val;
                    break;
                }
                node2=node2.next;
            }
            node = node.next;
            i++;
        }
        return ans;
    }
}