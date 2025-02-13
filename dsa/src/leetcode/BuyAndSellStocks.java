package leetcode;

public class BuyAndSellStocks {
    public int maxProfit(int[] prices) {

        int max = prices[0];
        int min = prices[0];
        int imax = 0;
        int imin = 0;
        int profit = 0;
        for(int i = 1; i<prices.length; i++) {
            if(prices[i] > max || imax < imin) {
                max = prices[i];
                imax = i;
            }
            if(prices[i] < min ) {
                min = prices[i];
                imin = i;
            }
            int difference = max - min;
            if(imin < imax && difference > profit) {
                profit = difference;
            }

        }
        return profit;
    }
}
