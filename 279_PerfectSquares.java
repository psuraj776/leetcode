class Solution {
    public int numSquares(int n) {
        List<Integer> li = new ArrayList<>();
        //Set<Integer> hs = new HashSet<>();
        for(int i=1; i*i <= n; i++){
            li.add(i*i);
            //hs.add(i*i);
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i=1; i<=n; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i=1; i<=n; i++){
            for(int j : li){
                if(j <= i){
                    int sub_res = dp[i - j];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < dp[i])
                       dp[i] = sub_res + 1;
                }
            }
        }
        return dp[n];
    }
    /*
    
    0 1 2 
    
    */
}
