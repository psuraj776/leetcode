/* Time O(n)  //as we are iterating once in array
*  Space O(n) //as we are using map and in worst case we might have to store n-1 number where last two pair would be the answer.
*/


#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

vector<int> twoSum(vector<int>& nums, int target) {
    int n = nums.size();
    unordered_map<int, int> ump;
    for(int i=0;i<n;i++) {
      if(ump.find(nums[i]) != ump.end()) {
        return {ump[nums[i]], i};
      }
      int remaining = target-nums[i];
      ump[remaining]=i;
    }
    return {};
}
int main() {
  vector<int> nums = {2,7,11,15};
  int target = 9;
  vector<int> res = twoSum(nums,target);
  cout<<res[0]<<" "<<res[1]<<endl;
}
