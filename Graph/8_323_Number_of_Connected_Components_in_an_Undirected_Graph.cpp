class Solution {
private:
    void bfs(vector<vector<int>> adj, vector<bool>& vis, int i) {
        queue<int> q;
        vis[i]=true;
        q.push(i);
        while(!q.empty()) {
            int x=q.front();
            q.pop();
            for(auto e:adj[x]){
                if(!vis[e]){
                    q.push(e);
                    vis[e]=true;
                }
            }
        }
    }
public:
    int countComponents(int n, vector<vector<int>>& edges) {
        vector<vector<int>> adj(n);

        for(auto e:edges) {
            adj[e[0]].push_back(e[1]);
            adj[e[1]].push_back(e[0]);
        }

        queue<int> q;
        vector<bool> vis(n, false);
        int res=0;

        for(int i=0;i<n;i++) {
            if(!vis[i]){
                bfs(adj, vis, i);
                res++;
            }
        }
        return res;
    }
};
