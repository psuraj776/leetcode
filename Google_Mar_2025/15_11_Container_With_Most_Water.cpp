#include <iostream>
#include <vector>
using namespace std;


/*Time O(n)
* Space O(1)
*
*
*/
int maxArea(vector<int>& height) {
    int n=height.size();
    int left=0;
    int right=n-1;
    int res=0;
    while(left<right){
        int mini=min(height[left],height[right]);
        res=max(res, mini*(right-left));
        if(height[left]<height[right]) left++;
        else right--;
    }
    return res;
}

int main() {
    vector<int> height = {1,8,6,2,5,4,8,3,7};
    int res=maxArea(height);
    cout << res<<endl;
    return 0;
}
