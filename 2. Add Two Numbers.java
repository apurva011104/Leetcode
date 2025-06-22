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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1=l1;
        ListNode h2=l2;
        int carry=0;
        ListNode ans=new ListNode(0);
        ListNode swap=ans;
        while(h1!=null && h2!=null){
            int sum=h1.val+h2.val+carry;
            carry=sum/10;
            ListNode nn=new ListNode(sum%10);
            ans.next=nn;
            ans=ans.next;
            h1=h1.next;
            h2=h2.next;
        }
        while(h1!=null){
            int sum=h1.val+carry;
            carry=sum/10;
            ListNode nn=new ListNode(sum%10);
            ans.next=nn;
            ans=ans.next;
            h1=h1.next;
        }
        while(h2!=null){
            int sum=h2.val+carry;
            carry=sum/10;
            ListNode nn=new ListNode(sum%10);
            ans.next=nn;
            ans=ans.next;
            h2=h2.next;
        }
        if(carry==1){
            ListNode nn=new ListNode(carry);
            ans.next=nn;;
        }
        return swap.next;
    }
}
