class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nex = head;
        while(curr != null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        head = prev;
        return head;
    }
    /*    nex
         curr    
            1   2   3   4   5
    prev
    
    nex = curr.nex;
    curr.next  =prev
    prev = curr;
    curr = nex
    */
    
}
