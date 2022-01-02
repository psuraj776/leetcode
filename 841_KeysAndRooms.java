class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] v = new boolean[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        while(!st.isEmpty()){
            int temp = st.pop();
            if(v[temp]) continue;
            for(int i : rooms.get(temp)){
                st.push(i);
            }
            v[temp] = true;
        }
        for(int i=0;i<n;i++){
            if(!v[i]) return false;
        }
        return true;
    }
}
