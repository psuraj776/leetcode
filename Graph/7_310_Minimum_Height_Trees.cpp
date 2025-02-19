/*
Time O(V)
Space O(V)
*/
class Solution {
public:
    vector<int> findMinHeightTrees(int n, vector<vector<int>>& edges) {
        vector<vector<int>> adj(n);
        vector<int> in(n);
        for(auto e:edges) {
            adj[e[0]].push_back(e[1]);
            adj[e[1]].push_back(e[0]);
            in[e[0]]++;
            in[e[1]]++;
        }
        
        queue<int> q;
        for(int i=0;i<n;i++) {
            if(in[i] == 1){
                q.push(i);
                in[i]=0;
            }
        }


        int remain=n;

        while(!q.empty()){
            int q_n=q.size();
            if(remain == q_n){
                vector<int> res;
                while(!q.empty()) {
                    res.push_back(q.front());
                    q.pop();
                }
                return res;
            }
            remain -= q_n;
            int curr_n=q_n;
            while(curr_n>0){
                int x=q.front();
                q.pop();
                for(auto a:adj[x]){
                    if(in[a] >= 1){
                        in[a]--;
                        if(in[a]==1){
                            q.push(a);
                            in[a]--;
                        }
                        //in[a]--;
                    }
                }
                curr_n--;
            }
        }
        return {0};
        
    }
};
