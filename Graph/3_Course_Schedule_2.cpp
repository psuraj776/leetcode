class Solution {
public:
    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        vector<vector<int>> adj(numCourses);
        for(int i=0;i<prerequisites.size();i++) {
            adj[prerequisites[i][1]].push_back(prerequisites[i][0]);
        }
        vector<int> inDegree(numCourses);
        for(int i=0;i<prerequisites.size();i++) {
            inDegree[prerequisites[i][0]]++;
        }
        queue<int> q;
        for(int i=0;i<numCourses;i++) {
            if(inDegree[i]==0) q.push(i);
        }
        vector<int> res;
        while(!q.empty()) {
            int temp=q.front();
            q.pop();
            res.push_back(temp);
            for(auto v:adj[temp]){
                inDegree[v]--;
                if(inDegree[v]==0) q.push(v);
            }
        }
        if(res.size()==numCourses){
            return res;
        }
        return {};
    }
};
