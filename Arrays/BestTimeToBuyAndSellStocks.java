public class BestTimeToBuyAndSellStocks {
  public int maxProfit(int[] prices) {
    int len = prices.length;
    int buyPrice = Integer.MAX_VALUE;
    int sellPrice = Integer.MIN_VALUE;
    for (int i = 0; i < len; i++) {
      if (prices[i] < buyPrice) {
        buyPrice = prices[i];
      }
      int profit = prices[i] - buyPrice;
      if (profit > sellPrice) {
        sellPrice = profit;
      }
    }
    return sellPrice;
  }
}
