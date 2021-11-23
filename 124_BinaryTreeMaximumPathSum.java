class Solution {
    int ans;
    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        helper(root);
        return ans;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(0,helper(root.left));
        int right = Math.max(0,helper(root.right));
        int temp_ans = root.val + left + right;
        ans = ans>temp_ans?ans:temp_ans;
        return Math.max(left,right)+root.val;
    }
}
