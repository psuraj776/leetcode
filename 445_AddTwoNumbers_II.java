class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> l1_temp = new Stack<>();
        Stack<Integer> l2_temp = new Stack<>();
        while(l1 != null || l2 != null){
            if(l1 != null){
                l1_temp.push(l1.val);
                l1 = l1.next;
            }
            if(l2 != null){
                l2_temp.push(l2.val);
                l2 = l2.next;
            }
        }
        ListNode ans = new ListNode(-1);
        ListNode to_return = ans;
        int carry = 0;
        while(!l1_temp.isEmpty() || !l2_temp.isEmpty() || carry != 0){
            int curr_sum = carry;
            if(!l1_temp.isEmpty()){
                curr_sum += l1_temp.pop();
            }
            if(!l2_temp.isEmpty()){
                curr_sum += l2_temp.pop();
            }
            carry = curr_sum/10;
            ans.next = new ListNode(curr_sum % 10);
            ans = ans.next;
        }
        return helper(to_return.next);
    }
    public ListNode helper(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode nexx = curr;
        while(curr != null){
            nexx = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nexx;
        }
        return prev;
    }
}
