/*
Time O(n)
Space O(1)
*/
class Solution {
public:
    int maxArea(vector<int>& height) {
        int n=height.size();
        int left=0;
        int right=n-1;
        int res=0;
        while(left<right){
            int mini=min(height[left],height[right]);
            res=max(res, mini*(right-left));
            if(height[left]<height[right]) left++;
            else right--;
        }
        return res;      
    }
};
