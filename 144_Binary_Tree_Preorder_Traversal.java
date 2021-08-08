List<Integer> res  = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root!=null){
            res.add(root.val);
            res = preorderTraversal(root.left);
            
            res = preorderTraversal(root.right);
        }
        return res;
}