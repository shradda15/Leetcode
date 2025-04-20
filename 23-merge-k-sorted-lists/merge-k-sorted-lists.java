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
        List<Integer> l=new ArrayList<>();
        for(ListNode i:lists){
            while(i!=null){
                l.add(i.val);
                i=i.next;
            }
        }
        Collections.sort(l);
        ListNode h=new ListNode();
        ListNode f=h;
        for(int i:l){
            h.next=new ListNode(i);
            h=h.next;
        }
        return f.next;
    }
}