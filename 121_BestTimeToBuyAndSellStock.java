class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] arL = new int[n];
        int[] arR = new int[n];
        arL[0] = prices[0];
        arR[n-1] = prices[n-1];
        for(int i=1;i<n;i++){
            if(arL[i-1] < prices[i]){
                arL[i] = arL[i-1];
            }
            else{
                arL[i] = prices[i];
            }
        }
        for(int i=n-2;i>=0;i--){
            if(arR[i+1] > prices[i]){
                arR[i] = arR[i+1];
            }
            else{
                arR[i] = prices[i];
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            if(ans < (arR[i]-arL[i])){
                ans = arR[i]-arL[i];
            }
        }
        
        return ans;
        
        
    }
}