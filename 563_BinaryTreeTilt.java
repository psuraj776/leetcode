class Solution {
    int sum;
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        sum=0;
        helper(root);
        return sum;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = root.left == null?0:helper(root.left);
        int right = root.right == null?0:helper(root.right);
        int tilt = left>right?left-right:right-left;
        sum += tilt;
        return left+right+root.val;
    }
}
