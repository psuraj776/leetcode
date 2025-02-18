/*
Time O(nm)
Space O(1)
*/

class Solution {
public:
    int strStr(string haystack, string needle) {
        int h=haystack.size();
        int n=needle.size();

        for(int i=0;i<=h-n;i++){
            int temp_i=i;
            int temp_n=0;
            while(temp_n<n){
                if(haystack[temp_i]==needle[temp_n]){
                    temp_n++;
                    temp_i++;
                }
                else{
                    break;
                }
            }
            if(temp_n==n) return i;
        }
        return -1;
    }
};
