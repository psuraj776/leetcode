class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode first = head;
        ListNode secon = head;
        ListNode temp  = head;
        int k_temp = k;
        while(temp != null){
            k--;
            if(k == 0){
                first = temp;
            }
            count++;
            temp = temp.next;
        }
        count -= k_temp;
        temp = head;
        while(count-- > 0){
            temp = temp.next;
        }
        secon = temp;
        int va = first.val;
        first.val = secon.val;
        secon.val = va;
        return head;
    }
}
