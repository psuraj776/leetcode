public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode toReturn = head;

        while(curr != null){
            if(curr.val == prev.val){
                prev.next = curr.next;
                curr = prev.next;
            }
            else{
                prev = prev.next;
                curr = curr.next;
            }
        }
        
        return toReturn;
        
    }