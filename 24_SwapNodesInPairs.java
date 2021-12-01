class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null)return head;
        ListNode cur = head.next, prev = head, lastPair = null;
        while(cur != null){
            if(prev == head){
            	prev.next =cur.next;
                cur.next = prev;
                head = cur;
                lastPair = head.next;
                
            }
            else{
                lastPair.next = cur;
                prev.next = cur.next;
                cur.next = prev;
                lastPair = prev;
            }
            prev = prev.next;
            cur = cur.next;
            if(cur.next != null){
                cur = cur.next.next;
                
            }
            else cur = cur.next; 
            
        }
        return head;
        
    }
    /*
    1     2     3     4
    prev  curr  n
    
    
    
    prev.next = curr.next;
    curr.next = prev
    
    prev = 
    
    */
}