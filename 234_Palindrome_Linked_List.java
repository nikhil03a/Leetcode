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
    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        int size = 0;
        Stack<Integer> list = new Stack();
        while(node!=null){
            size++;
            list.push(node.val);
            node = node.next;
        }
        int i = 0 ;
        node  = head;
        while(i < size/2){
            if(node.val==list.pop()){
                node = node.next;
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
