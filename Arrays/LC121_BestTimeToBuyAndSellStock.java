package Arrays;

public class LC121_BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int j = prices.length -1;
        int profit = 0;
        for(int i = prices.length-2;i>=0;i--){
            if(prices[j] > prices[i]){
                profit = Math.max(profit,prices[j]-prices[i]);
            }else{
                j = i;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
