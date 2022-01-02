class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for(int i=0;i<n;i++){
            g.add(new ArrayList<>());
        }
        for(int[] a : edges){
            g.get(a[0]).add(a[1]);
            g.get(a[1]).add(a[0]);
        }
        boolean[] v = new boolean[n];
        return helper(n, g, start, end, v);
    }
    public boolean helper(int n, ArrayList<ArrayList<Integer>> g, int start, int end, boolean[] v){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        v[start] = true;
        while(!q.isEmpty()){
            int temp = q.remove();
            if(v[end]) return true;
            for(int i : g.get(temp)){
                if(!v[i]){
                    q.add(i);
                    v[i] = true;
                }
            }
        }
        return false;
    }
}
