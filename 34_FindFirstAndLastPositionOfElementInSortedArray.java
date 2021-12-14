class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        boolean isleft = true;
        int[] ans = new int[2];
        ans[0] = helperBS(left, right, nums, target, isleft);
        isleft = false;
        ans[1] = helperBS(left, right, nums, target, isleft);
        return ans;
    }
    public int helperBS(int left, int right, int[] nums, int target, boolean isleft){
        int toreturn = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                toreturn = mid;
                if(isleft){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else if(nums[mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return toreturn;
    }
}
