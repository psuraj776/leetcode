class Solution {
    boolean ans;
    public boolean isBalanced(TreeNode root) {
        ans = true;
        helper(root);
        return ans;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        int diff = Math.abs(left - right);
        if(diff > 1) ans = false;
        return Math.max(left, right)+1;
    }
}
