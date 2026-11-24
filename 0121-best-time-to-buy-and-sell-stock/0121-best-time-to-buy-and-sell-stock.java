class Solution {
    public int maxProfit(int[] prices) {   
        int profit = 0;
        int stock = prices[0];
        for(int i=0;i<prices.length;i++){
            stock = Math.min(stock,prices[i]);
            profit = Math.max(profit,prices[i]-stock);
        }
        return profit;
        
    }
}                                                         