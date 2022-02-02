class Solution {
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        helper(root, low, high);
        return sum;
    }
    public void helper(TreeNode root, int low, int high){
        if(root != null){
            if(root.val >= low && root.val <= high){
                sum += root.val;
            }
            helper(root.left, low, high);
            helper(root.right, low, high);
        }
    }
}