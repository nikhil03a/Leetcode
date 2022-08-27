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
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next == null)
            return head;
        ListNode node1 = head;
        int size = 0;
        while(node1!=null){
            size++;
            node1  = node1.next;
        }
        node1 = head;
        ListNode node2 = head;
        for(int i=2;i<=k;i++){
            node1 = node1.next;
        }
        int n = size-k+1;
        for( int i=2; i<=n; i++){
            node2 = node2.next;
        }  
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
        return head;
    }
}