#include <iostream>
using namespace std;

/*  Time O(m+n)
*   Space O(1)
*
*
*/

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
    ListNode *temp1=l1;
    ListNode *temp2=l2;
    ListNode *res=new ListNode(0);
    ListNode *dummy = res;
    int carry=0;
    
    while(temp1!=nullptr || temp2!=nullptr || carry != 0) {
        int val1=temp1==nullptr?0:temp1->val;
        int val2=temp2==nullptr?0:temp2->val;
        
        int sum = val1+val2+carry;
        int mod = sum%10;
        carry = sum/10;
        res->next=new ListNode(mod);
        res=res->next;
        temp1=temp1==nullptr?nullptr:temp1->next;
        temp2=temp2==nullptr?nullptr:temp2->next;
    }
    return dummy->next;
}

void insert(ListNode*& head, int val) {
    ListNode* toAdd = new ListNode(val);
    if(!head){
        head = toAdd;
        return;
    }
    ListNode* temp = head;
    while(temp->next != nullptr) {
        temp=temp->next;
    }
    temp->next = toAdd;
}

int main() {
    ListNode *l1=nullptr;
    insert(l1, 2);
    insert(l1, 4);
    insert(l1, 3);
    
    ListNode *l2=nullptr;
    insert(l2, 5);
    insert(l2, 6);
    insert(l2, 4);
    ListNode *res = addTwoNumbers(l1, l2);
    
    //print result List
    ListNode *temp = res;
    while(temp != nullptr){
        cout<<temp->val<<" ";
        temp=temp->next;
    }
    return 0;
}
