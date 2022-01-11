class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] presum = new int[gas.length];
        presum[0] = (gas[0] - cost[0]);
        for(int i=1; i<gas.length; i++){
            presum[i] = presum[i-1]+(gas[i] - cost[i]);
        }
        int sum = 0;
        int ans = -1;
        for(int i=0; i<gas.length; i++){
            sum = sum+(gas[i] - cost[i]);
            if(sum < 0){
                sum = 0;
                ans = -1;
                continue;
            }
            else{
                if(ans == -1 && (presum[gas.length-1]) >= 0){
                    ans = i;
                }
            }
        }
        return ans;
    }
}
