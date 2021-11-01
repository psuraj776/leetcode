class Solution {
    public String countAndSay(int n) {
        return helper("1",n-1);
    }
    public String  helper(String ans, int n){
        if(n <= 0){
            return ans;
        }
        int count = 1;
        char num = ans.charAt(0);
        int len = ans.length();
        StringBuilder sb = new StringBuilder();
        int i=1;
        while(i<len){
            if(ans.charAt(i) == num){
                count++;
            }
            else{
                sb.append(count+"");
                sb.append(num+"");
                num = ans.charAt(i);
                count=1;
                //i+=1;
            }
            i+=1;
        }
        sb.append(count+"");
        sb.append(num+"");
        return helper(sb.toString(),n-1);
    }
    /*
    "3113112221232112111312211312113211"
    4  e"1211"     r"1211"
    5  e"111221"   r"111211"
    */
}