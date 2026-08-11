class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=1; i<n; i++){
            minPrice = Math.min(minPrice,prices[i]);
            int CurrentProfit = prices[i] - minPrice;
            maxProfit = Math.max(CurrentProfit,maxProfit);
        }
        return maxProfit;
    }
}