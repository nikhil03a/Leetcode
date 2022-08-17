/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int len =  length(head);
        ListNode f = head;
        ListNode s = head;
        if(len==0){
            return null;
        }
        while(len>0){
            s=s.next;
            len--;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return f;
    }
    public int length(ListNode head){
        ListNode f = head;
        ListNode s = head;
        int ans=0;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
            if(f==s){
                do{
                    f=f.next;
                    ans++;
                }while(f!=s);
                return ans;
            }
        }
        return ans;
    }
}
