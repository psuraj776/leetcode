public int trap(int[] height) {
        int n = height.length;
        int[] from_left = new int[n];
        int[] from_right = new int[n];
        from_left[0] = height[0];
        for(int i=1;i<n;i++){
            if(height[i]>from_left[i-1]){
                from_left[i] = height[i];
            }
            else{
                from_left[i] = from_left[i-1];
            }
        }
        from_right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            if(height[i]>from_right[i+1]){
                from_right[i] = height[i];
            }
            else{
                from_right[i] = from_right[i+1];
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans += Math.abs(height[i]-Math.min(from_left[i],from_right[i]));
        }
        return ans;
    }