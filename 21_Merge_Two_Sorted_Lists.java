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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = list1;
        while(temp!=null){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        if(temp==null)
            return list2;
        else
            temp.next=list2;
        ListNode node1 = list1;
        while(node1!=null){
            ListNode node2 = node1.next;
            while(node2!=null){
                if(node2.val<node1.val){
                    ListNode swap= new ListNode(node1.val);
                    node1.val=node2.val;
                    node2.val=swap.val;
                }
                node2=node2.next;
            }
            node1=node1.next;
        }
        return list1;
    }
}
