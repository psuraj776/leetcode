#include <iostream>
#include <string>
using namespace std;

/*
*  Time O(n^2)
*  Space O(1)
*/

string longestPalindrome(string s) {
    int n=s.size();
    if(n==1) return s;
    int res=0;
    int left=0;
    int right=0;
    for(int i=0;i<n;i++){
        //odd
        int temp_left=i;
        int temp_right=i;
        while(temp_left>=0 && temp_right<n && s[temp_left]==s[temp_right]){
            temp_left--;
            temp_right++;
        }
        if(res < (temp_right-temp_left-1)){
            res=temp_right-temp_left-1;
            left=temp_left+1;
            right=temp_right-1;
        }
        //even
        temp_left=i;
        temp_right=i+1;
        while(temp_left>=0 && temp_right<n && s[temp_left]==s[temp_right]){
            temp_left--;
            temp_right++;
        }
        if(res < (temp_right-temp_left-1)){
            res=temp_right-temp_left-1;
            left=temp_left+1;
            right=temp_right-1;
        }

    }
    return s.substr(left, res);
}

int main() {
    string s = "geekejek";
    string res=longestPalindrome(s);
    cout <<res;
    return 0;
}
