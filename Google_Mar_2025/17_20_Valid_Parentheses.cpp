#include <iostream>
#include <stack>
#include <string>
using namespace std;


/*Time O(n)
* Space O(n)
*
*
*/
bool isValid(string s) {
    stack<char> st;
    int n=s.size();
    for(int i=0;i<n;i++){
        if(s[i]=='(' || s[i]=='[' || s[i]=='{'){
            st.push(s[i]);
        }
        else if(s[i]==')'){
            if(st.empty()||st.top()!='('){
                return false;
            }
            st.pop();
        }
        else if(s[i]=='}'){
            if(st.empty()||st.top()!='{'){
                return false;
            }
            st.pop();
        }
        else if(s[i]==']'){
            if(st.empty()||st.top()!='['){
                return false;
            }
            st.pop();
        }
    }
    return st.empty();
}

int main() {
    string s = "()[]{}";
    bool res=isValid(s);
    if(res) cout<<"true"<<endl;
    else cout<<"false"<<endl;
    return 0;
}
