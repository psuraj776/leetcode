class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        int x1 = 0;
        int x2 = 1;
        int x3 = 1;
        for(int i=3;i<=n;i++){
            int temp = x1+x2+x3;
            x1 = x2;
            x2 = x3;
            x3 = temp;
        }
        return x3;
    }
}
