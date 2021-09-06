class Solution {
    public int minDistance(String word1, String word2) {
        /* Recursive
        if(word1.length() == 0){
            return word2.length();
        }
        if(word2.length() == 0){
            return word1.length();
        }
        if(word1.charAt(word1.length()-1) == word2.charAt(word2.length()-1)){
            return minDistance(word1.substring(0,word1.length()-1),
                               word2.substring(0,word2.length()-1));
        }
        int D = minDistance(word1.substring(0,word1.length()-1),word2);
        int U = minDistance(word1,word2.substring(0,word2.length()-1));
        int R = minDistance(word1.substring(0,word1.length()-1),
                            word2.substring(0,word2.length()-1));
        return Math.min(D,Math.min(U,R))+1;
        */
        int word1L = word1.length();
        int word2L = word2.length();
        int[][] dp = new int[word1L+1][word2L+1];
        for(int i=0;i<=word1L;i++){
            dp[i][0] = i;
        }
        for(int i=0;i<=word2L;i++){
            dp[0][i] = i;
        }
        for(int i=1;i<=word1L;i++){
            for(int j=1;j<=word2L;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    int temp = Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1])) + 1;
                    dp[i][j] = temp;
                }
            }
        }
        
        return dp[word1L][word2L];
    }
}