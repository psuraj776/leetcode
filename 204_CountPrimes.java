class Solution {
    public int countPrimes(int n) {
        if(n<=1) return 0;
        boolean[] v = new boolean[n];
        v[0]=true;
        v[1]=true;
        for(int i=2;i*i<n;i++){
            if(!v[i]){
                for(int j=i*i;j<n;j+=i){
                    v[j] = true;
                }
            }
        }
        int ans=0;
        for(boolean b : v){
            if(!b) ans+=1;
        }
        return ans;
    }
}
