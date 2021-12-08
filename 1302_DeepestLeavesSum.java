class Solution {
    class Node{
        TreeNode node;
        int hei;
        Node(TreeNode node, int hei){
            this.node = node;
            this.hei = hei;
        }
    }
    public int deepestLeavesSum(TreeNode root) {
        int height = heightHelper(root);
        int ans = ansHelper(root, height);
        return ans;
    }
    public int heightHelper(TreeNode root){
        if(root == null) return 0;
        int left = heightHelper(root.left) + 1;
        int right = heightHelper(root.right) + 1;
        return left>right?left:right;
    }
    public int ansHelper(TreeNode root, int height){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(root, 1));
        int ans = 0;
        while(!q.isEmpty()){
            Node temp = q.remove();
            TreeNode tempn = temp.node;
            int templ = temp.hei;
            if(templ == height){
                ans += tempn.val;
            }
            if(tempn.left != null){
                q.add(new Node(tempn.left, templ+1));
            }
            if(tempn.right != null){
                q.add(new Node(tempn.right, templ+1));
            }
            
        }
        return ans;
    }
}
