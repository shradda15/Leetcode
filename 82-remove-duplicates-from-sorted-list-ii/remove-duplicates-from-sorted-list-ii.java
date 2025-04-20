class Solution {  
    public ListNode deleteDuplicates(ListNode head) {  
        if (head == null) return null;  
        ListNode dummy = new ListNode(0, head);  
        ListNode prev = dummy;
        ListNode curr = head;  
        while (curr != null) {  
            int val = curr.val;  
            while (curr.next != null && curr.next.val == val) {  
                curr = curr.next;  
            }  
            if (prev.next == curr) {  
                prev = prev.next;  
            } 
            else{   
                prev.next = curr.next;  
            } 
            curr = curr.next;  
        }  
        return dummy.next;  
    }  
}  