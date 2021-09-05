class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        helper(nums.length,nums,new ArrayList<>());
        return res;
    }
    public void helper(int n,int[] nums,List<Integer> temp){
        if(temp.size() == n){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<n;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            helper(n,nums,temp);
            int N = temp.size()-1;
            temp.remove(N);
        }
    }
}