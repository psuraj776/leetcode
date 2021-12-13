class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int n = nums.length;
        if(n == 0) return null;
        int maxIndex = 0;
        for(int i=1; i<n; i++){
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(nums[maxIndex]);
        int[] l = new int[maxIndex];
        for(int i=0;i<maxIndex;i++){
            l[i] = nums[i];
        }
        root.left = constructMaximumBinaryTree(l);
        int[] r = new int[n-(maxIndex+1)];
        for(int i=0;i<n-(maxIndex+1);i++){
            r[i] = nums[i+maxIndex+1];
        }
        root.right = constructMaximumBinaryTree(r);
        return root;
    }
}
