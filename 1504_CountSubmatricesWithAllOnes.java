class Solution {
    public int numSubmat(int[][] mat) {
        int R=mat.length;
        int C=mat[0].length;
        for(int r=0;r<R;r++){
            for(int c=C-2;c>=0;c--){
                if(mat[r][c]==1){
                    mat[r][c]=mat[r][c]+mat[r][c+1];
                }
            }
        }
        int count=0;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                int min_width=mat[r][c];
                for(int d=r;d<R;d++){
                    if(mat[d][c]==0) break;
                    min_width=Math.min(min_width,mat[d][c]);
                    count+=min_width;
                }
            }
        }
        return count;
    }
}
