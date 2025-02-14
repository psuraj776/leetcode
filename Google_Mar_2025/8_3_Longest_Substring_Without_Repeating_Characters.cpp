#include <iostream>
#include <string>
#include <unordered_map>
using namespace std;


/* Time O(2n)=O(n) as we are vising each index twice in worst case
*  Space O(min(n,m)) n is string size and m is charset size
*
*/
int lengthOfLongestSubstring(string s) {
    int n=s.size();
    if(n==0) return 0;
    unordered_map<char, int> ump;
    int left=0;
    int res=0;
    for(int i=0;i<n;i++) {
        char x=s[i];
        ump[x]++;
        while(ump[x]>1){
            char y=s[left];
            ump[y]--;
            left++;
        }
        res = max(res, i-left+1);
    }
    return res;
}
int main() {
    string s="abcabcbb";
    int res = lengthOfLongestSubstring(s);
    cout <<res<<endl;
    return 0;
}
