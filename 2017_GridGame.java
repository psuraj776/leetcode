class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long[] pre = new long[n+1];
        long[] suf = new long[n+1];
        
        long ans = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            suf[n-i-1] = suf[n-i]+grid[0][n-i-1];
            pre[i+1] = pre[i]+grid[1][i];
        }
        
        for(int i=0;i<n;i++){
            ans = Math.min(ans,Math.max(pre[i],suf[i+1]));
        }
        
        return ans;
        
    }
}
