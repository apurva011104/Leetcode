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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next==null)
        return head;
        int n=0;
        ListNode current=head;
        while(current!=null){
        current=current.next;
        n++;
        }
        current=head;
        for(int i=0;i<k-1;i++){
            current=current.next;
        }
        ListNode nextAdd=current.next;
        current.next=null;
        current.next=head;
        ListNode temp=head;
        ListNode temp2=head.next;
        head.next=null;
        head=current;
        while(temp2!=head){
            current.next=temp2;
            temp2=temp2.next;
            current.next.next=temp;
            temp=current.next;
        }
        while(current.next!=null)
        current=current.next;
        current.next=nextAdd;
        int div=n/k-1;
        for(int i=0;i<div;i++){
            ListNode prev=current;
            current=current.next;
            prev.next=null;
            temp=current;
            for(int j=0;j<k-1;j++){
                current=current.next;
            }
            nextAdd=current.next;
            current.next=null;
            current.next=temp;
            temp2=temp.next;
            temp.next=null;
            while(temp2!=current){
                current.next=temp2;
                temp2=temp2.next;
                current.next.next=temp;
                temp=current.next;
            }
            prev.next=current;
            while(current.next!=null)
            current=current.next;
            current.next=nextAdd;
        }
        return head;

    }
}
