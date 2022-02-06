class Solution {
    int count=0;
    public int countArrangement(int N) {
        boolean[] v = new boolean[N+1];
        helper(N,1,v);
        return count;
    }
    public void helper(int N,int pos,boolean[] v){
        if(pos>N){
            count++;
            return;
        }
        for(int i=1;i<=N;i++){
            if(!v[i]&&(pos%i==0 || i%pos==0)){
                v[i]=true;
                helper(N,pos+1,v);
                v[i]=false;
            }
        }
    }
}
