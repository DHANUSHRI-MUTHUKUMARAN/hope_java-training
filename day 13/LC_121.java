public class LC_121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price: prices) {
            min = java.lang.Math.min(price, min);
            maxProfit = java.lang.Math.max(maxProfit, price - min);
        }
        return maxProfit;
    }
}
