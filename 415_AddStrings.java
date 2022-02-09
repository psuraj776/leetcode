class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        int n1 = num1.length();
        int n2 = num2.length();
        int i = n1-1;
        int j = n2-1;
        while(i>=0 && j>=0){
            int temp = carry + (num1.charAt(i)-'0') + (num2.charAt(j)-'0');
            ans.append((temp%10)+"");
            carry = temp/10;
            i--;
            j--;
        }
        while(i>=0){
            int temp = carry + (num1.charAt(i)-'0');
            ans.append((temp%10)+"");
            carry = temp/10;
            i--;
        }
        while(j>=0){
            int temp = carry + (num2.charAt(j)-'0');
            ans.append((temp%10)+"");
            carry = temp/10;
            j--;
        }
        if(carry != 0) ans.append((carry)+"");
        ans.reverse();
        return ans.toString();
    }
}
