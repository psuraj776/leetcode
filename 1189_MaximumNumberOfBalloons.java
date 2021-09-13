class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] ar = new int[26];
        ar['b'-97]++; ar['a'-97]++; ar['l'-97]++; ar['l'-97]++;ar['o'-97]++;ar['o'-97]++;ar['n'-97]++;
        int[] toAr = new int[26];
        for(char c : text.toCharArray()){
            toAr[c-97]++;
        }
        int count=0;
        while(toAr['b'-97]>0 && toAr['a'-97]>0 && toAr['n'-97]>0 && toAr['l'-97]>=2 && toAr['o'-97]>=2){
            toAr['b'-97]--; 
            toAr['a'-97]--; 
            toAr['l'-97]--; toAr['l'-97]--;
            toAr['o'-97]--; toAr['o'-97]--;
            toAr['n'-97]--;
            count++;
        }
        return count;
    }
}