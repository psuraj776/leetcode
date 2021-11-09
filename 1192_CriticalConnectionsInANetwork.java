class Solution {
    int timer;
    List<List<Integer>> res;
    ArrayList<ArrayList<Integer>> G;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        timer = 0;
        res = new ArrayList<>();
        G = new ArrayList<>();
        for(int i=0;i<n;i++){
            G.add(new ArrayList<>());
        }
        for(List<Integer> L : connections){
            G.get(L.get(0)).add(L.get(1));
            G.get(L.get(1)).add(L.get(0));
        }
        boolean[] V = new boolean[n];
        int[] in = new int[n];
        int[] lo = new int[n];
        for(int i=0;i<n;i++){
            if(!V[i]){
                dfs(V, in, lo, -1, i);
            }
        }
        return res;
    }
    public void dfs(boolean[] V, int[] in, int[] lo, int p, int node){
        V[node] = true;
        in[node] = lo[node] = timer++;
        for(int child : G.get(node)){
            if(child == p) continue;
            if(V[child]){
                lo[node] = Math.min(lo[node],in[child]);
            }
            else{
                dfs(V, in, lo, node, child);
                lo[node] = Math.min(lo[node],lo[child]);
                if(lo[child] > in[node]){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(node);
                    temp.add(child);
                    res.add(new ArrayList<>(temp));
                }
            }
        }
    }
}
