public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        if(sum%2 == 1) return false;
        sum = sum/2;
        boolean[] ar = new boolean[sum+1];
        ar[0] = true;
        for(int i=0; i<nums.length; i++){
            for(int j=sum; j>=nums[i]; j--){
                if(ar[j-nums[i]]){
                    ar[j] = true;
                }
            }
        }
        return ar[sum];
    }