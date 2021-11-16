class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxRes = 0;
        for(int i=0;i<=len;i++){
            int currHeight = i==len?0:heights[i];
            while(!st.isEmpty() && currHeight < heights[st.peek()]){
                int currTopIndex = st.pop();
                int leftLimitofWidth = st.isEmpty()?-1:st.peek();
                int widthOfCurrRect = i - leftLimitofWidth - 1;
                int area = widthOfCurrRect * heights[currTopIndex];
                maxRes = maxRes > area?maxRes : area;
            }
            st.push(i);
        }
        return maxRes;
    }
}
