class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        
        for(int i : arr){
            if(count>=3) return true;
            if(i%2 == 0) count=0;
            else count++;
        }
        return count>=3?true:false;
    }
}