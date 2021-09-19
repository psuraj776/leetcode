class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] ar = new int[26];
        for(char c : s.toCharArray()) {
            ar[(c - 'a')]++;
        }
        
        int value = 0;
        for(int i : ar) {
            if (i == 0) continue;
            
            if (value == 0) {
                value = i;
                continue;
            }
            
            if(value != i) return false;
        }
        return true;
    }
}