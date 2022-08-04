package DSI;
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(bruteForce(prices));

        int[] amount = {7,6,4,3,1};
        System.out.println(onePass(amount));
    }

    public static int bruteForce(int[] prices){
        int max = 0;
        for (int i = 0; i < prices.length ; i++) {
            for (int j = i + 1; j < prices.length ; j++) {
                int profit = prices[j] - prices[i];
                if (profit >= max){
                    max  = profit;
                }
            }
        }
        return max;
    }

    public static int onePass(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice){
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
