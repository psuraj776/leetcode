class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper("", 0, 0, n, res);
        return res;
    }
    public void helper(String sb,int left, int right, int n, List<String> res){
        if(left == n && right == n){
            res.add(sb);
            return;
        }
        if(left < n){
            helper(sb+"(",left+1,right,n,res);
        }
        if(right < left && right < n){
            helper(sb+")",left,right+1,n,res);
        }
    }
}