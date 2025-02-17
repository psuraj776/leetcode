class Solution {
private:
    bool dfs(vector<vector<int>> adj, vector<bool>& vis, int n, int i, int parent){
        vis[i]=true;

        for(auto x:adj[i]){
            if(!vis[x]){
                if(dfs(adj, vis, n, x, i)) return true;
            }
            else{
                if(x != parent) return true;
            }
        }
        return false;
    }
public:
    bool validTree(int n, vector<vector<int>>& edges) {
        vector<vector<int>> adj(n);
        for(int i=0;i<edges.size();i++) {
            adj[edges[i][0]].push_back(edges[i][1]);
            adj[edges[i][1]].push_back(edges[i][0]);
        }

        vector<bool> visi(n, false);

        bool res=dfs(adj, visi, n, 0, 0);
        for(int i=0;i<n;i++){
            if(!visi[i]) return false;
        }
        
        return !res;
    }
};
