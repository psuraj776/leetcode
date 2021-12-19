class Solution {
    public int countSquares(int[][] m) {
        int result=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==1) result++;
            }
        }
        for(int i=1;i<m.length;i++){
            for(int j=1;j<m[0].length;j++){
                int min=Math.min(m[i-1][j],Math.min(m[i][j-1],m[i-1][j-1]));
                //int max=Math.max(m[i-1][j],Math.max(m[i][j-1],m[i-1][j-1]));
                if(min==0||m[i][j]==0){
                    continue;
                }
                /*if(max==min){
                    m[i][j]=max+1;
                    result+=(m[i][j]-1);
                }
                if(max!=min){
                    m[i][j]=min+1;
                    result+=(m[i][j]-1);
                }*/
                m[i][j]=min+1;
                result+=(m[i][j]-1);
            }
        }
        return result;
    }
}
