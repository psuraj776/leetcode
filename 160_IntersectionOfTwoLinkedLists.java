public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs = new HashSet<>();
        for(ListNode temp = headA; temp != null; temp = temp.next){
            hs.add(temp);
        }
        for(ListNode temp = headB; temp != null; temp = temp.next){
            if(hs.contains(temp)) return temp;
        }
        return null;
    }
}
