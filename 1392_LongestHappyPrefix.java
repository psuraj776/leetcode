class Solution {
    public String longestPrefix(String s) {
        int len = 0;
        int i = 1;
        int[] dp = new int[s.length()];
        while(i < s.length()){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                dp[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = dp[len - 1];
                }
                else{
                    dp[i] = len;
                    i++;
                }
            }
        }
        String toreturn = s.substring(s.length()-dp[s.length()-1]);
        return toreturn;
    }
}
