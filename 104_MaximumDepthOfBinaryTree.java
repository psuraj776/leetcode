public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int left = root.left == null?0:maxDepth(root.left)+1;
        int right = root.right == null?0:maxDepth(root.right)+1;
        return left>right?left:right;
    }
