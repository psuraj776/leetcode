#include <iostream>
#include <vector>
#include <set>
#include <string>
#include <limits.h>
using namespace std;


/*
* Time O(N^2)
* Space O(N)
*/
int minAreaRect(vector<vector<int>>& points) {
    set<string> st;
    for(auto v:points){
        string temp = to_string(v[0])+"|"+to_string(v[1]);
        st.insert(temp);
    }
    int n=points.size();
    int res=INT_MAX;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(points[i][0] != points[j][0] && points[i][1] != points[j][1]) {
                pair<int, int> temp1={points[i][0], points[j][1]};
                pair<int, int> temp2={points[j][0], points[i][1]};
                string temp11=to_string(temp1.first)+"|"+to_string(temp1.second);
                string temp12=to_string(temp2.first)+"|"+to_string(temp2.second);
                if(st.find(temp11) != st.end() && st.find(temp12) != st.end()){
                    res=min(res, abs(points[i][0]-points[j][0]) * abs(points[i][1]-points[j][1]));
                }
            }
        }
    }
    return res==INT_MAX?0:res;
}

int main() {
    vector<vector<int>> points = {{1,1},{1,3},{3,1},{3,3},{2,2}};
    int res=minAreaRect(points);
    cout <<res<<endl;
    return 0;
}
