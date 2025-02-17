class Solution {
public:
    vector<int> findRedundantConnection(vector<vector<int>>& edges) {
        int n=edges.size();
        vector<vector<int>> adj(edges.size()+1);
        vector<int> in(n+1);
        for(auto e:edges) {
            adj[e[0]].push_back(e[1]);
            adj[e[1]].push_back(e[0]);
            in[e[0]]++;
            in[e[1]]++;
        }
        queue<int> q;
        for(int i=1;i<=n;i++){
            if(in[i]==1){
                q.push(i);
                in[i]--;
            }
        }
        
        while(!q.empty()){
            int x=q.front();
            q.pop();

            for(auto a:adj[x]){
                if(in[a]==0) continue;
                in[a]--;
                if(in[a]==1){
                    q.push(a);
                    in[a]--;
                }
            }
        }
        for(int i=n-1;i>=0;i--) {
            if(in[edges[i][0]]!=0 && in[edges[i][1]]!=0){
                return edges[i];
            }
        }
        return {};
    }
};
