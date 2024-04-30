public class MaxProfit {
    //
    //using Kadane's Algorithm
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            } else if (profit<prices[i]-buy) {
                profit=prices[i]-buy;
            }
        }
        return profit;
    }
}
