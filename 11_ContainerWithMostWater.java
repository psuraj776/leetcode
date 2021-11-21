class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int temp = height[left] > height[right]?height[right]*(right - left):height[left]*(right - left);
            ans = ans > temp?ans : temp;
            if(height[left] > height[right]){
                right --;
            }
            else{
                left++;
            }
        }
        return ans;
    }
}
