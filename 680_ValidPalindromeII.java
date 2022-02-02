class Solution {
    public boolean validPalindrome(String s) {
        return helper(s, 0, s.length()-1, false);
    }
    public boolean helper(String s, int left, int right, boolean temp){
        if(left >= right) return true;
        if(s.charAt(left) != s.charAt(right)){
            if(temp){
                return false;
            }
            else{
                if(helper(s, left+1, right, true)) return true;
                else return helper(s, left, right-1, true);
            }
        }
        return helper(s, left+1, right-1, temp);
    }
}
