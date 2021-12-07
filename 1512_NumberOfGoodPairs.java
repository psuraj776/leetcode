class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] ar = new int[101];
        for(int i : nums){
            ar[i]++;
        }
        int count = 0;
        for(int i : ar){
            if(i >= 2){
                count += ((i-1)*(i)/2);
            }
        }
        return count;
    }
}
