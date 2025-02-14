/* Time O(max(n1+n2)) as we are iterating to both the string. it doesnt matter with it is iterating with same index it cant be O(max(n1,n2))
*  Space O(1) we are not using any extra space other than result string
*
*/

#include <iostream>
#include <string>
using namespace std;

string mergeAlternately(string word1, string word2) {
    int n1=word1.size();
    int n2=word2.size();
    string res;
    
    for(int i=0;i<max(n1,n2); i++) {
        if(i<n1) res += word1[i];
        if(i<n2) res += word2[i];
    }
    return res;
}
int main() {
    string word1="indore";
    string word2="jaipur";
    string res = mergeAlternately(word1, word2);
    cout<<res<<endl;
    return 0;
}
