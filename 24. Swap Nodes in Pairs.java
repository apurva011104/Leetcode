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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode current=head;
        ListNode ne=current.next;
        current.next=ne.next;
        ne.next=current;
        head=ne;
        ListNode prev=current;
        current=current.next;
        while(current!=null && current.next!=null){
            ne=current.next;
            current.next=ne.next;
            ne.next=current;
            prev.next=ne;
            prev=current;
            current=current.next;
        }
        return head;
    }
}
