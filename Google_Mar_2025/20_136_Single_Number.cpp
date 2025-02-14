#include <iostream>
#include <vector>
using namespace std;

/* Idea is to take bitwise xor of whole array bitwise xor of same number are zero
*  Time O(n)
*  Space O(1)
*/

int singleNumber(vector<int>& nums) {
    int res=0;
    for(auto i:nums) res ^= i;
    return res;
}
    
int main() {
    vector<int> nums={2,1,3,3,1};
    int res=singleNumber(nums);
    cout << res;
    return 0;
}
