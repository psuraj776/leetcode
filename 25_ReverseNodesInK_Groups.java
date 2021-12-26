/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        ListNode temp1=head;
        int[] ar=new int[size];
        for(int i=0;i<size;i++){
            ar[i]=temp1.val;
            temp1=temp1.next;
        }
        for(int i=0;i<size;i+=k){
            int start=i;
            int end=(i+k-1);
            if(end<size){
            while(start<end){
                int tem=ar[start];
                ar[start]=ar[end];
                ar[end]=tem;
                start+=1;
                end-=1;
                
            }
            }
        }
        ListNode temp3=head;
        int j=0;
        while(temp3!=null){
            temp3.val=ar[j];
            j+=1;
            temp3=temp3.next;
        }
        return head;
        
    }
}
