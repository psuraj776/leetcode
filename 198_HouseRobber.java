class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int i=1;i<n;i++){
            if(i!=1) dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
            else dp[i] = Math.max(nums[0], nums[1]);
        }
        return dp[n-1];
    }
}
