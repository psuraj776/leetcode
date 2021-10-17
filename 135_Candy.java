class Solution {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            candy[i]=-1;
        }
        int sum=0;
        for(int i=0;i<ratings.length;i++){
            if(candy[i]==-1){
                candy[i]=helper(i,ratings,candy);
            }
            sum+=candy[i];
        }
        return sum;
    }
    public int helper(int i,int[] ratings,int[] candy){
        if(candy[i]!=-1) return candy[i];
        if(i-1>=0&&ratings[i-1]<ratings[i]&&i+1<ratings.length&&ratings[i+1]<ratings[i]){
            candy[i] = Math.max(helper(i-1,ratings,candy),helper(i+1,ratings,candy))+1;
        }
        else if(i-1>=0&&ratings[i-1]<ratings[i]) candy[i]= helper(i-1,ratings,candy)+1;
        else if(i+1<ratings.length&&ratings[i+1]<ratings[i]) candy[i]= helper(i+1,ratings,candy)+1;
        else{
            candy[i]=1;
            
        }
        return candy[i];
    }
}