class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int left = start;
        int right = start;
        int ans = Integer.MAX_VALUE;
        while(true){
            if(left>=0 && nums[left] == target){
                ans = Math.min(ans,Math.abs(left-start));
                break;
            }
            if(right<nums.length && nums[right] == target){
                ans = Math.min(ans,Math.abs(right-start));
                break;
            }
            left--;
            right++;
        }
        return ans;
    }
}