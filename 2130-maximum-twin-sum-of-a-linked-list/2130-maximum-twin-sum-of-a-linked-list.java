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
    public int pairSum(ListNode head) {
        // int sum = 0;
        // int n = 0;
        // ListNode node  = head;
        // Stack<Integer> st = new Stack();
        // while(node!=null){
        //     st.push(node.val);
        //     node = node.next;
        //     n++;
        // }
        // node = head;
        // for(int i = 0; i <= (n/2)-1; i++){
        //     int temp = node.val + st.pop();
        //     if(temp>sum){
        //         sum = temp;
        //     }
        //     node = node.next;
        // }
        // return sum;
        
        //Optimized Solution
        ListNode curr = head;
        ListNode prev = null;
        ListNode forhead = head;
        while(curr!=null){
            curr = curr.next.next;
            ListNode temp = forhead.next;
            forhead.next = prev;
            prev = forhead;
            forhead =temp;
        }
        int max = Integer.MIN_VALUE;
        curr = head;
        while(forhead!=null){
            int temp = forhead.val+prev.val;
            if(temp>max){
                max = temp;
            }
            forhead = forhead.next;
            prev = prev.next;
        }
        return max;
    }
    // public ListNode get(ListNode head, int n){
    //     if(n==0){
    //         return head;
    //     }else{
    //         while(n>0){
    //             head = head.next;
    //             n--;
    //         }
    //     }
    //     return head;
    // }
}