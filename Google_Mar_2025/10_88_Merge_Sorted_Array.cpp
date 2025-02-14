#include <iostream>
#include <vector>
using namespace std;


/* Time O(m+n)
*  Space O(1)
*
*
*/

void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
    int n2=n-1;
    int n1=m-1;
    int real_n1=nums1.size()-1;

    while(n1>=0 || n2>=0) {
        if(n2<0) {
            nums1[real_n1]=nums1[n1];
            n1--;
            real_n1--;
            continue;
        }
        if(n1<0) {
            nums1[real_n1]=nums2[n2];
            n2--;
            real_n1--;
            continue;
        }
        if(nums2[n2] > nums1[n1]) {
            nums1[real_n1]=nums2[n2];
            n2--;
        }
        else {
            nums1[real_n1]=nums1[n1];
            n1--;
        }
        real_n1--;
    }
}

int main() {
    vector<int> nums1 = {1,2,3,0,0,0};
    vector<int> nums2 = {2,5,6};
    int m=3;
    int n=3;
    merge(nums1, m, nums2, n);
    for(auto i:nums1){
        cout<<i<<" ";
    }
    return 0;
}
