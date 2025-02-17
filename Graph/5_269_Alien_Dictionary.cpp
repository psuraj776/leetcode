class Solution {
public:
    string alienOrder(vector<string>& words) {
        vector<vector<int>> adj(26);
        int n=words.size();

        unordered_map<char, int> counts;
        for(auto word : words){
            for(auto c:word){
                counts[c]=0;
            }
        }
        
        for(int i=0;i<n-1;i++) {
            string prev=words[i];
            string curr=words[i+1];
            int n1=prev.size();
            int n2=curr.size();
            int temp1=0;
            int temp2=0;
            while(temp1<n1 && temp2<n2){
                if(prev[temp1] != curr[temp2]){
                    adj[prev[temp1]-'a'].push_back(curr[temp2]-'a');
                    counts[curr[temp2]]++;
                    break;
                }
                temp1++;
                temp2++;
            }
            if(temp2==n2 && temp1<n1) return "";
        }
        queue<char> q;
        for(auto count:counts){
            if(count.second == 0) q.push(count.first);
        }
        string res="";
        while(!q.empty()){
            char c=q.front();
            q.pop();
            res+=c;

            for(auto ch : adj[c-'a']){
                char cx=(char)(ch+97);
                counts[cx]--;
                if(counts[cx]==0) q.push(cx);
            }

        }
        //cout<<res<<endl;
        if(res.size() < counts.size()) return "";
        return res;
    }
};
