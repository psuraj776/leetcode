/*
Time O(n)
Space O(1)
*/
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n=nums.size();
        if(n==1) return 1;
        int l=0;
        int r=1;
        while(r<n) {
            if(nums[r]==nums[l]){
                r=r+1;
            }
            else{
                l=l+1;
                nums[l]=nums[r];
                r=r+1;
            }
        }
        return l+1;
    }
};
