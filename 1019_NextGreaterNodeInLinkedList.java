class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<int[]> st = new Stack<>();
        int i=0;
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int[] ans = new int[count];
        temp = head;
        while(temp != null){
            if(st.isEmpty()){
                st.push(new int[]{temp.val, i});
            }
            else{
                while(!st.isEmpty() && st.peek()[0]<temp.val){
                    ans[st.peek()[1]] = temp.val;
                    st.pop();
                }
                st.push(new int[]{temp.val,i});
            }
            i++;
            temp = temp.next;
        }
        while(!st.isEmpty()){
            ans[st.peek()[1]] = 0;
            st.pop();
        }
        return ans;
    }
}
