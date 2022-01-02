class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] in = new int[n+1];
        int[] ou = new int[n+1];
        for(int[] a : trust){
            ou[a[0]]++;
            in[a[1]]++;
        }
        int ans = -1;
        for(int i=1;i<=n;i++){
            if(in[i] == n-1 && ou[i] == 0){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
