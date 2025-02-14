#include <iostream>
using namespace std;

int climbStairs(int n) {
    if(n<=2)
        return n;
    int first= 1;
    int second = 2;
    for(int i = 3; i<=n; i++)
    {
        int temp = first+second;
        first= second;
        second = temp;
    }
    return second;
}

int main() {
    int n=5;
    int res=climbStairs(n);
    cout << res;
    return 0;
}
