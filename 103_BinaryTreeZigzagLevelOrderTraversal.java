public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean toAdd = true;
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode temp = q.remove();
                l.add(temp.val);
                //if(!toAdd){
                    if(temp.left!=null) q.add(temp.left);
                    if(temp.right!=null) q.add(temp.right);
                //}
                //else{
                //    if(temp.right!=null) q.add(temp.right);
                //    if(temp.left!=null) q.add(temp.left);
                //}
            }
            if(toAdd){
                ans.add(l);
            }
            else{
                Collections.reverse(l);
                ans.add(l);
            }
            toAdd = !toAdd;
        }
        return ans;
    }
