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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode node = head;
        int size = 0;
        while(node!=null){
            node = node.next;
            size++;
        }
        node = head;
        int width = size/k;
        int rem = size%k;
        ListNode[] ans = new ListNode[k]; 
        for(int i=0; i<k; i++){
            ListNode write = new ListNode(0);
            ListNode temp = write;
            for(int j = 0; j<width+(i<rem ? 1 : 0);j++){
                write = write.next = new ListNode(node.val);
                node = node.next;
            }
            ans[i] = temp.next;
        }
        return ans;
    }
}