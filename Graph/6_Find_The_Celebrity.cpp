/* The knows API is defined for you.
      bool knows(int a, int b); */

/*
Time O(n)
Space O(1)
API call O(n+n+n)
*/
class Solution {
private:
    bool isCeleb(int x, int n) {
        for(int i=0;i<n;i++) {
            if(i == x) continue;
            if(knows(x, i) || !knows(i, x)) return false;
        }
        return true;
    }
public:
    int findCelebrity(int n) {
        int celeb=0;
        for(int i=0;i<n;i++) {
            if(knows(celeb, i)) {
                celeb=i;
            }
        }
        if(isCeleb(celeb, n)){
            return celeb;
        }
        return -1;
    }
};
