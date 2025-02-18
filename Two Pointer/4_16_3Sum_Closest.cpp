/*
Time O(n2)
Space O(logn) to O(n)
*/
class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        sort(nums.begin(), nums.end());
        int n=nums.size();
        int ans=INT_MAX;
        for(int i=0;i<n && ans!=0;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=nums[l]+nums[r]+nums[i];
                if(abs(target-sum) < abs(ans)) {
                    ans=target-sum;
                }
                if(sum<target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return target-ans;
    }
};
