class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        k = k % length;
        if (k == 0) {
            return head; 
        }
        while (k-- > 0) {
            ListNode curr = head;
            ListNode prev = null;
            while (curr.next != null) {
                prev = (prev == null) ? head : prev.next;
                curr = curr.next;
            }
            prev.next = null;
            curr.next = head;
            head = curr;
        }
        return head;
    }
}
