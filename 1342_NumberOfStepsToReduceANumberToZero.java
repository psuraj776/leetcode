public int numberOfSteps(int num) {
        int res = 0;
        while(num>0){
            num = num%2==0?num/2:num-1;
            res+=1;
        }
        return res;
    }