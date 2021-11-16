class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        return helper(s,t,sLen,tLen);
    }
    public boolean helper(String s, String t, int sLen, int tLen){
        if(sLen==0) return true;
        if(sLen>tLen) return false;
        return s.charAt(sLen-1) == t.charAt(tLen-1)?helper(s, t, sLen-1, tLen-1):helper(s, t, sLen, tLen-1);
    }
}
