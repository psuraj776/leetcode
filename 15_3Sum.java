class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<String> hs = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int remainingSum = 0-(nums[i]);
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k] < 0){
                    j++;
                }
                else if(nums[i]+nums[j]+nums[k] > 0){
                    k--;
                }
                else{
                    String temp = nums[i]+"-"+nums[j]+"-"+nums[k];
                    if(!hs.contains(temp)){
                        List<Integer> t = new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);
                        ans.add(new ArrayList<>(t));
                        hs.add(temp);
                    }
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }
    /*
    [-4, -1, -1, 0, 1, 2]
    */
}
