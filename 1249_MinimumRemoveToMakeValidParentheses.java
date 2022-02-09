class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<int[]> st = new Stack<>();
        HashSet<Integer> hs = new HashSet<>();
        int n = s.length() - 1;
        for(int i=0; i<=n; i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') continue;
            if(s.charAt(i) == ')'){
                if(st.isEmpty()){
                    continue;
                }
                else{
                    hs.add(i);
                    hs.add(st.peek()[1]);
                    st.pop();
                }
            }
            else{
                st.push(new int[]{0, i});
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=n; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == ')'){
                if(hs.contains(i)) sb.append(s.charAt(i));
            } 
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    
    /*
    
    0 open  (
    1 close )
    
    */
    
}
