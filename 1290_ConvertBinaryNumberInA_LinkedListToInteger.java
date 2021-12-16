class Solution {
    public int getDecimalValue(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int ans = 0;
        count = count-1;
        while(temp != null){
            ans = temp.val == 0?ans : ans+(int)Math.pow(2,count);
            count--;
            temp = temp.next;
        }
        return ans;
    }
}
