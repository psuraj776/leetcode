public int guessNumber(int n) {
        int temp = 1;
        int mid = 0;
        while(true){
            mid = temp + (n-temp)/2;
            if(guess(mid) == 0){
                break;
            }
            else if(guess(mid)<0){
                n = mid-1;
            }
            else{
                temp = mid+1;
            }
        }
        return mid;
    }