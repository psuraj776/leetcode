class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int[] prefixSumArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            prefixSumArr[i + 1] = prefixSumArr[i] + arr[i];
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((j - i + 1) % 2 == 1) { 
                    sum += prefixSumArr[j + 1] - prefixSumArr[i];
                }
            }
        }
        return sum;
    }
}