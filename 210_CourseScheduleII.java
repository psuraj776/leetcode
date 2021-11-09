class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if(numCourses == 1) return new int[]{0};
        if(prerequisites.length == 0){
            int[] ans = new int[numCourses];
            for(int i=0;i<numCourses;i++){
                ans[i]=i;
            }
            return ans;
        }
        ArrayList<ArrayList<Integer>> G = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            G.add(new ArrayList<>());
        }
        int[] inTime = new int[numCourses];
        for(int[] A : prerequisites){
            inTime[A[0]]++;
        }
        for(int[] A : prerequisites){
            if(A[0] == A[1]) return new int[]{0};
            G.get(A[1]).add(A[0]);
        }
        Queue<Integer> Q = new LinkedList<>();
        int count=0;
        for(int i=0;i<numCourses;i++){
            if(inTime[i] == 0){
                count++;
                Q.add(i);
            }
        }
        if(count==0) return new int[]{};
        int[] ans = new int[numCourses];
        int i=0;
        while(!Q.isEmpty()){
            int X = Q.remove();
            ans[i++]=X;
            for(int child : G.get(X)){
                inTime[child]--;
                if(inTime[child]==0){
                    Q.add(child);
                }
            }
        }
        return i==numCourses?ans:new int[]{};
    }
}
