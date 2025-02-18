/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
 /*
 Time O(N)
 Space O(1)
 */
class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if(k==0) return head;
        if(head == nullptr) return head;
        int count=0;
        ListNode* fast=head;
        while(fast!=nullptr){
            count++;
            fast=fast->next;
        }
        fast=head;
        k=k%count;
        for(int i=0;i<k;i++){
            if(fast->next == nullptr) fast=head;
            else fast=fast->next;
        }
        ListNode* slow=head;
        while(fast->next != nullptr){
            fast=fast->next;
            slow=slow->next;
        }

        fast->next=head;
        head=slow->next;
        slow->next=nullptr;
        return head;
    }
};
