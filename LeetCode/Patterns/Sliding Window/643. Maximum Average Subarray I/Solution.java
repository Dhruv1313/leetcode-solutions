class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        double max = -(int)1e9;
        int sum = 0;
        for(int right =0; right<n; right++){
            sum += nums[right];
        
        if (right - left + 1 ==k){
            double  avg = (double) sum/k;
            max = Math.max(max,avg);
            sum -= nums[left];
            left++;
        }
        }
        return max;

    }
}