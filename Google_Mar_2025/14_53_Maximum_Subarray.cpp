#include <iostream>
using namespace std;

/* Time O(n)
*  Space O(1)
*
*
*/

int maxSubArray(vector<int>& nums) {
    int maxRes=nums[0];
    int tempRes=nums[0];
    int n=nums.size();
    for(int i=1;i<n;i++) {
        tempRes=max(nums[i], tempRes+nums[i]);
        maxRes=max(maxRes, tempRes);
    }
    return maxRes;
}

int main() {
    vector<int> nums = {-2,1,-3,4,-1,2,1,-5,4};
    int res=maxSubArray(nums);
    cout <<res<<endl;
    return 0;
}
