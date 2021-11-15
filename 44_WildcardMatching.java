class Solution {
    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        boolean[][] dp = new boolean[sLen+1][pLen+1];
        dp[0][0] = true;
        for(int i=1;i<=pLen;i++){
            if(p.charAt(i-1) == '*'){
                dp[0][i] = dp[0][i-1];
            }
            else{
                dp[0][i] = false;
            }
        }
        for(int i=1;i<=sLen;i++){
            dp[i][0] = false;
        }
        for(int i=1;i<=sLen;i++){
            for(int j=1;j<=pLen;j++){
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*'){
                    dp[i][j] = (dp[i][j-1])||(dp[i-1][j])||(dp[i-1][j-1])?true:false;
                }
                else{
                    dp[i][j] = false;
                }
            }
        }
        /*
        for(int i=0;i<=sLen;i++){
            for(int j=0;j<=pLen;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.print("\n");
        }
        */
        return dp[sLen][pLen];
    }
}
