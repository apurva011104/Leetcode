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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        HashMap<ListNode,Integer> map=new HashMap<>();
        for(int i=0;i<lists.length;i++){
            ListNode current=lists[i];
            while(current!=null){
                map.put(current,current.val);
                current=current.next;
            }
        }
        if(map.isEmpty())   return null;
        PriorityQueue<Map.Entry<ListNode,Integer>> queue=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        queue.addAll(map.entrySet());
        Map.Entry<ListNode, Integer> entry = queue.poll();
        ListNode head=entry.getKey();
        ListNode current=head;
        while (!queue.isEmpty()) {
            entry = queue.poll();
            current.next=entry.getKey();
            current=current.next;
        }
        current.next=null;
        return head;
    }
}
