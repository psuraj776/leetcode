class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int ans = 0;
        for(int i=0;i<matrix.length;i++){
            dp[i][0] = matrix[i][0]-'0';
            ans = Math.max(ans, dp[i][0]); 
        }
        for(int i=0;i<matrix[0].length;i++){
            dp[0][i] = matrix[0][i]-'0';
            ans = Math.max(ans, dp[0][i]);
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j] == '0'){
                    dp[i][j] = 0;
                }
                else{
                    if(dp[i-1][j] == 0 || dp[i][j-1] == 0 || dp[i-1][j-1] == 0){
                        dp[i][j] = 1;
                    }
                    else{
                        dp[i][j] = Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1])+1;
                    }
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans*ans;
    }
    /*
    [["1","1","1","1","0"],
     ["1","1","1","1","0"],
     ["1","1","1","1","1"],
     ["1","1","1","1","1"],
     ["0","0","1","1","1"]]
    */
    
}
