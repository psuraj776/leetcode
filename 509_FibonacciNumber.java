class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        int x1 = 0;
        int x2 = 1;
        for(int i=2;i<=n;i++){
            int temp = x1+x2;
            x1 = x2;
            x2 = temp;
        }
        return x2;
    }
}