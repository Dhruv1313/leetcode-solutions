class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n==1) return nums[0];
        int case1 = robLinear(nums,0,n-2);
        int case2 = robLinear(nums,1,n-1);
        return Math.max(case1,case2);
    }
    private int robLinear(int[] nums, int start , int end){
        int previous = 0;
        int previousPrevious = 0;
        for(int i=start; i<=end; i++){
            int skip = previous;
            int take = nums[i] + previousPrevious;
            int current = Math.max(skip,take);
            previousPrevious = previous;
            previous = current;
        }
        return previous;
    }
}