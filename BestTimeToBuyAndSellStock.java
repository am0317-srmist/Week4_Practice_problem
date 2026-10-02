public class BestTimeToBuyAndSellStock {
    static int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        int lowestPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - lowestPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }

            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
