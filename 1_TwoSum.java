public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                res[0] = hm.get(nums[i]);
                res[1] = i;
                break;
            }
            else{
                int remain = target - nums[i];
                hm.put(remain, i);
            }
            
        }
        return res;
    }