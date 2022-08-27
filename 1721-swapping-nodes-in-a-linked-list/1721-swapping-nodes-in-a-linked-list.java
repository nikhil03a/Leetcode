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
        ListNode prev = null;
        ListNode node2 = head;
        for(int i=2;i<=k;i++){
            prev = node1;
            node1 = node1.next;
        }
        int n = size-k+1;
        for( int i=2; i<=n; i++){
            node2 = node2.next;
        }  
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
        // ListNode con = prev;
        // ListNode tail = node1;
        // ListNode pre = node1;
        // ListNode curr = node1.next;
        // while(pre!=node2 && curr!=null){
        //     ListNode rem = curr.next;
        //     curr.next = pre;
        //     pre = curr;
        //     curr = rem;
        // }
        // tail.next = curr;
        // if(con!=null)
        //     con.next = pre;
        // else
        //     head = pre;
        return head;
    }
}