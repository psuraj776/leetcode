 public double myPow(double x, int n) {
        if(n==Integer.MIN_VALUE){
            x=x*x;
            n+=1;
        }
        if(n<0) return 1.0/helper(x,-n);
        return helper(x,n);
    }
    
    public double helper(double x, int n){
        if(n==0){
            return 1.0;
        }
        if(n==1){
            return x;
        }
        return n%2 == 0?helper(x*x, n/2):x*helper(x*x,(n-1)/2);
    }