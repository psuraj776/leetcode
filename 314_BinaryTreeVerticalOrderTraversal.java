class Solution {
    class node{
        TreeNode Node;
        int length;
        node(TreeNode Node, int length){
            this.Node = Node;
            this.length = length;
        }
    }
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<node> q = new LinkedList<>();
        TreeMap<Integer, List<Integer>> tm = new TreeMap<>();
        q.add(new node(root, 0));
        while(!q.isEmpty()){
            node temp = q.remove();
            List<Integer> toadd = tm.containsKey(temp.length)?tm.get(temp.length):new ArrayList<>();
            toadd.add(temp.Node.val);
            tm.put(temp.length, toadd);
            if(temp.Node.left != null){
                q.add(new node(temp.Node.left, temp.length-1));
            }
            if(temp.Node.right != null){
                q.add(new node(temp.Node.right, temp.length+1));
            }
        }
        for(Map.Entry<Integer,List<Integer>> e : tm.entrySet()){
            ans.add(e.getValue());
        }
        return ans;
    }
}
