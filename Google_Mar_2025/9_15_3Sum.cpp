#include <iostream>
#include <vector>
#include <set>
#include <string>
#include <algorithm>
using namespace std;

/* Approach one a simple one
*  Time O(n2)
*  Space O(n)
*
*/
vector<vector<int>> threeSum(vector<int>& nums) {
    set<string> st;
    int n=nums.size();
    sort(nums.begin(), nums.end());
    vector<vector<int>> res;
    
    for(int i=0;i<n-2;i++){
        int second=i+1;
        int third=n-1;
        while(second < third){
            int temp_add = nums[i]+nums[second]+nums[third];
            if( temp_add == 0) {
                string tocheck = to_string(nums[i])+"|"+to_string(nums[second])+"|"+to_string(nums[third]);
                if(st.find(tocheck) == st.end()) {
                    res.push_back({nums[i],nums[second],nums[third]});
                    st.insert(tocheck);
                }
                second++;
                third--;
            }
            else if(temp_add > 0) {
                third--;
            }
            else {
                second++;
            }
        }
    }
    return res;
}
int main() {
    vector<int> nums = {-1,0,1,2,-1,-4};
    vector<vector<int>> res = threeSum(nums);
    
    for(auto v : res) {
        for(int i=0;i<v.size();i++) {
            cout<<v[i]<<" ";
        }
        cout<<"\n";
    }
    return 0;
}
