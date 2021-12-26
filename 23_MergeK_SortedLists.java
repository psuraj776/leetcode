/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==0) return null;
        if(n==1) return lists[0];
        return mergeLists(lists,0,n-1);
    }
    public ListNode mergeLists(ListNode[] lists,int left,int right){
        if(left-right==0) return lists[left];
        if(right-left==1) return merge(lists[left],lists[right]);
        int mid=left+(right-left)/2;
        ListNode A=mergeLists(lists,left,mid);
        ListNode B=mergeLists(lists,mid+1,right);
        return merge(A,B);
    }
    public ListNode merge(ListNode A,ListNode B){
        if(A==null) return B;
        if(B==null) return A;
        if(A.val<B.val){
            A.next=merge(A.next,B);
            return A;
        }
        else{
            B.next=merge(A,B.next);
            return B;
        }
    }
}
