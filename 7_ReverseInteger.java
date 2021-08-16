 public int reverse(int x) {
        int res = 0;
        while(x!=0){
            if(isOverFlow(res,10)) return 0;
            res = res*10 + x%10;
            x = x/10;
        }
        return res;
    }
    public boolean isOverFlow(int x,int y){
        if(x == 0 || y == 0) return false;
        int res = x*y;
        if(x == res/10) return false;
        return true;
    }