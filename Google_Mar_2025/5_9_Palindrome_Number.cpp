/* Time O(log10(x))
*  Space O(1)
*
*/

#include <iostream>
using namespace std;

bool isPalindrome(int x) {
    //base case
    if(x<0) return false;
    if(x%10 == 0 && x!=0) return false;
    
    int temp_x=0;
    
    while(x>temp_x) {
        temp_x = temp_x*10 + (x%10);
        x = x/10;
    }
    return x==temp_x || x==temp_x/10;
}
int main() {
    int x=12344321;
    bool res = isPalindrome(x);
    if(res){
        cout<<"true"<<endl;
    }
    else{
        cout<<"false"<<endl;
    }
    return 0;
}
