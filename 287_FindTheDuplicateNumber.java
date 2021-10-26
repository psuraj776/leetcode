class Solution {
    public int findDuplicate(int[] nums) {
        int ans = -1;
        
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0){
                ans = index+1;
                break;
            }
            nums[index] = -nums[index];
        }
        
        return ans;
    }
}