class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        Set<Integer> st = new HashSet<>();
        while(true){
            int sum = 0;
            st.add(n);
            while(n>0){
                sum += Math.pow((n%10),2);
                n = n/10;
            }
            if(st.contains(sum)) return false;
            n=sum;
            if(sum==1) break;
        }
        return true;
    }
}