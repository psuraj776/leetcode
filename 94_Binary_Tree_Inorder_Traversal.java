List<Integer> res  = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root!=null){
            res = inorderTraversal(root.left);
            res.add(root.val);
            res = inorderTraversal(root.right);
        }
        return res;
    }