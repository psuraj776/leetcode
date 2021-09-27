class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        ArrayList<ArrayList<Integer>> G = new ArrayList<>();
        for(int i=0;i<n;i++){
            G.add(new ArrayList<>());
        }
        for(int i=0;i<n;i+=2){
            G.get(i).add(i+1);
            G.get(i+1).add(i);
        }
        for(int i=0; i<row.length; i+=2){
            if(Math.abs(row[i]-row[i+1])>1 || Math.max(row[i],row[i+1])%2==0){
                G.get(row[i]).add(row[i+1]);
                G.get(row[i+1]).add(row[i]);
            }
        }
        
        
        boolean[] V = new boolean[n];
        int ans = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            if(!V[i]){
                count = dfs(G,V,i);
            }
            if(count!=0 && count!=2){
                ans+=((count/2)-1);
            }
        }
        
        return ans;
    }
    
    public int dfs(ArrayList<ArrayList<Integer>> G, boolean[] V,int node){
        Stack<Integer> st = new Stack<>();
        st.push(node);
        V[node] = true;
        int node_count=0;
        while(!st.isEmpty()){
            int curr_node = st.pop();
            node_count+=1;
            for(int i : G.get(curr_node)){
                if(!V[i]){
                    st.push(i);
                    V[i]=true;
                }
            }
        }
        return node_count;
    }
}