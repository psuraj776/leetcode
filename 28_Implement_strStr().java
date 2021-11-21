class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int l = haystack.length();
        if(n == 0) return 0;
        if(l < n) return -1;
        int[] lps = new int[n];
        lps[0] = 0;
        int i=0;
        int j=1;
        while(j<n){
            if(needle.charAt(i) == needle.charAt(j)){
                lps[j] = i+1;
                i++;
                j++;
            }
            else{
                if(i == 0){
                    lps[j] = 0;
                    j++;
                }
                else{
                    i = lps[i-1];
                }
            }
        }
        i=0;
        j=0;
        for(int k=0;k<lps.length;k++){
            System.out.print(lps[k] + " ");
        }
        System.out.print("\n");
        while(i < l){
            if(j == n){
                //System.out.println("i = "+i+" j = "+j);
                return i-j;
            }
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
                if(i == l && j == n){
                    //System.out.println("i = "+i+" j = "+j);
                    return i-j;
                }
            }
            else{
                if(j == 0){
                    i++;
                }
                else{
                    j = lps[j-1];
                }
            }
        }
        return -1;
    }
}
