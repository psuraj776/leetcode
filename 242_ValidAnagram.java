class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] ar = new int[26];
        int[] ar1 = new int[26];
        for(int i=0;i<s.length();i++){
            ar[s.charAt(i)-97]++;
            ar1[t.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(ar[i]!=ar1[i]) return false;
        }
        return true;
    }
}