class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length+1];
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
        }
        int[] result=new int[2];
        for( int[] edge:edges ){
            int x=edge[0];
            int y=edge[1];
            /*if(st.contains(x)&&st.contains(y)){
                result[0]=x;
                result[1]=y;
            }*/
            int xRoot = getRoot(parent,x);
            int yRoot = getRoot(parent,y);
            if(xRoot!=yRoot){
                parent[yRoot]=xRoot;
            }
            else{
                result[0]=x;
                result[1]=y;
            }
            //st.add(x);
            //st.add(y);
        }
        return result;
    }
    public int getRoot(int[] parent,int i){
        while(parent[i]!=i){
            parent[i]=parent[parent[i]];
            i=parent[i];
        }
        return i;
    }
}
