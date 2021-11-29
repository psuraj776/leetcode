class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int left = -1;
        if(root.left != null){
            left = minDepth(root.left)+1;
        }
        int right = -1;
        if(root.right != null){
            right = minDepth(root.right)+1;
        }
        return left < 0?right : (right < 0)? left : (left < right) ? left : right;
    }
}
