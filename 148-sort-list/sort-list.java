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
    public ListNode sortList(ListNode head) {
        List<Integer> l=new ArrayList<>();
        ListNode curr=head;
        ListNode h=head;
        while(curr!=null){
            l.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(l);
        for(int i:l){
            h.val=i;
            h=h.next;
        }
        return head;
    }
}