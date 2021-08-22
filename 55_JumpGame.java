public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        if(nums[0] == 0) return false;
        int maxReachable = 0;
        for(int i=0; i<nums.length; i++){
            if(maxReachable == i && nums[i] == 0 && maxReachable < nums.length-1) return false;
            if(maxReachable >= nums.length-1) return true;
            maxReachable = Math.max(maxReachable, i+nums[i]);
        }
        return false;
    }