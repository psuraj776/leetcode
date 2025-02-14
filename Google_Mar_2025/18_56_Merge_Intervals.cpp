#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
/*Time O(nlogn)
* Space O(n)
*/
bool custComp(vector<int> i, vector<int> j){
    return i[0]==j[0]?i[1]<j[1]:i[0]<j[0];
}

vector<vector<int>> merge(vector<vector<int>>& intervals) {
    sort(intervals.begin(), intervals.end(), custComp);
    vector<vector<int>> res;

    int n=intervals.size();
    vector<int> prev=intervals[0];
    for(int i=1;i<n;i++) {
        vector<int> curr=intervals[i];
        if(curr[0]>prev[1]) {
            res.push_back({prev[0], prev[1]});
            prev[0]=curr[0];
            prev[1]=curr[1];
        }
        else if(curr[0]==prev[1]){
            prev[1]=curr[1];
        }
        else{
            prev[1]=max(prev[1], curr[1]);
        }
    }
    res.push_back({prev[0], prev[1]});
    return res;
}

int main() {
    vector<vector<int>> intervals = {{1,3},{2,6},{8,10},{15,18}};
    vector<vector<int>> res=merge(intervals);
    for(auto v:res){
        cout<<"{"<<v[0]<<" "<<v[1]<<"} ";
    }
    return 0;
}
