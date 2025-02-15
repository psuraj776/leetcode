class Solution {
public:
    bool canFinish(int numCourses, vector<vector<int>>& prerequisites) {

        vector<vector<int>> adj(numCourses);
        for(int i=0;i<prerequisites.size();i++) {
            adj[prerequisites[i][1]].push_back(prerequisites[i][0]);
        }
        vector<int> inDegree(numCourses);

        for(auto v : prerequisites) {
            inDegree[v[0]]++;
        }

        queue<int> q;
        for(int i=0;i<numCourses;i++) {
            if(inDegree[i] == 0){
                q.push(i);
            }
        }
        vector<int> res;
        while(!q.empty()) {
            int temp=q.front();
            res.push_back(temp);
            q.pop();

            for(auto it : adj[temp]){
                inDegree[it]--;
                if(inDegree[it] == 0){
                    q.push(it);
                }
            }
        }
        return res.size() == numCourses;
    }
};
