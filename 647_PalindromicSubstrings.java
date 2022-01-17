class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] v =  new boolean[n][n];
        for(int i=0;i<n;i++){
            v[i][i] = true;
        }
        int counter = 1;
        int ans = 0;
        while(counter < n){
            int j = counter;
            while(j < n){
                int i = j-counter;
                int tempi = i+1;
                int tempj = j-1;
                if(tempi <= tempj){
                    v[i][j] = v[tempi][tempj] && (s.charAt(i) == s.charAt(j));
                }
                else if(i == j-1){
                    v[i][j] = (s.charAt(i) == s.charAt(j));
                }
                if(v[i][j]) ans++;
                j++;
            }
            counter++;
        }

        return ans+n;
    }
    /*
    
    0 1
    1 2
    
    0 2

    
    aaa
       0  1  2  
    0  t  f
    1     t  f
    2        t

    
    */
}
