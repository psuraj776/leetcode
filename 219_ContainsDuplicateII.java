class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int j = hm.get(nums[i]);
                if(Math.abs(i - j) <= k){
                    return true;
                }
                hm.put(nums[i], i);
            }
            else{
                hm.put(nums[i], i);
            }
        }
        return false;
    }
}
