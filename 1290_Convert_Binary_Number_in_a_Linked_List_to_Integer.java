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
    public int getDecimalValue(ListNode head) {
        ListNode node = head;
        ListNode first = head;
        int size=0;
        while(node.next!=null){
            node=node.next;
            size++;
        }
        int ans=0;
        while(size>=0){
            if(first.val==1){
                ans+=Math.pow(2,size);
            }
            first=first.next;
            size--;
        }
        return ans;
        }
}
