class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if(len==2) return cost[0]>cost[1]?cost[1]:cost[0];
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];//dp[0]+cost[1]>cost[1];
        int i=2;
        while(i<len){
            int i1 = i-1<0?0:i-1;
            int i2 = i-2<0?0:i-2;
            if(i<len-1) dp[i] = Math.min(cost[i]+dp[i1],cost[i]+dp[i2]);
            else dp[i] = Math.min(dp[i1],cost[i]+dp[i2]);
            i++;
        }
        return dp[len-1];
    }
}
