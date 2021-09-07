class Solution {
    public int sumOfUnique(int[] nums) {
        int[] ar = new int[101];
        for(int i : nums){
            ar[i]++;
        }
        int sum = 0;
        for(int i=0;i<101;i++){
            if(ar[i] == 1){
                sum+=i;
            }
        }
        return sum;
    }
}