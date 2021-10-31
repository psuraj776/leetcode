class Solution {
    public List<List<Integer>> combinationSum(int[] c, int target) {
        int n = c.length;
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, 0, target, c, n, ans, new ArrayList<>(), 0);
        return ans;
    }
    public void helper(int curr_i, int sum, int target, int[] c, int n, List<List<Integer>> ans, List<Integer> temp, int right){
        if(sum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum > target){
            return;
        }
        
        for(int i=(right==n+1)?curr_i+1:curr_i; i<n; i++){
            if(right == n) right=i;
            temp.add(c[i]);
            helper(i, sum+c[i], target, c, n, ans, temp, right+1);
            int index = temp.size()-1;
            temp.remove(index);
        }
    }
}