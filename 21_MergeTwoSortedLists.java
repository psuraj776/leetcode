public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        if (l1.val > l2.val)
        {   
            ListNode temp = l2.next;
            l2.next = mergeTwoLists(l1, temp);
            return l2;
        }
        else
        {
            ListNode temp = l1.next;
            l1.next = mergeTwoLists(temp, l2);
            return l1;
        }
    }