#include <iostream>
#include <vector>
using namespace std;

/*
Approach 1
A index can hold water to the min height of max height from left and right and substracted by its own height.
Time O(n) we are iterating array thrice two to get max from left and right and one to get actual result
Space O(n) we are using two n size array to store left and right max


int trap(vector<int>& height) {
    int n=height.size();
    int left_max[n];
    left_max[0]=height[0];
    for(int i=1;i<n;i++) {
        if(height[i] > left_max[i-1]) left_max[i]=height[i];
        else left_max[i]=left_max[i-1];
    }
    
    int right_max[n];
    right_max[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--) {
        if(height[i]>right_max[i+1]) right_max[i]=height[i];
        else right_max[i]=right_max[i+1];
    }
    
    int res=0;
    for(int i=0;i<n;i++) {
        res += (min(left_max[i],right_max[i])-height[i]);
    }
    return res;
}
*/


/* Approach 2
*  Time O(n)
*  Space O(1)
*/
int trap(vector<int>& height) {
    int n=height.size();
    int left=0;
    int right=n-1;
    int left_max=0;
    int right_max=0;
    int res=0;
    while(left<right) {
        if(height[left] < height[right]){
            if(left_max > height[left]) {
                res += (left_max-height[left]);
            }
            else{
                left_max=height[left];
            }
            left++;
        }
        else {
            if(right_max > height[right]){
                res += (right_max - height[right]);
            }
            else {
                right_max=height[right];
            }
            right--;
        }
    }
    return res;
}

int main() {
    vector<int> height = {0,1,0,2,1,0,1,3,2,1,2,1};
    int res = trap(height);
    cout <<res<<endl;
    return 0;
}
