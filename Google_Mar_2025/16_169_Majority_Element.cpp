#include <iostream>
#include <vector>
using namespace std;


/*Time O(n)
* Space O(1)
*
*
*/
int majorityElement(vector<int>& nums) {
    int n=nums.size();
    int prev=0;
    int ans=0;
    for(int i=0;i<n;i++){
        if(prev==0){
            prev=1;
            ans=nums[i];
            continue;
        }
        if(nums[i] != ans){
            prev--;
        }
        else{
            prev++;
        }
    }
    return ans;
}

int main() {
    vector<int> nums = {2,2,1,1,1,2,2};
    int res=majorityElement(nums);
    cout << res<<endl;
    return 0;
}
