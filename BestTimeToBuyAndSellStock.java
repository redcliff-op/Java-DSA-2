public class BestTimeToBuyAndSellStock {
  public int maxProfit(int[] prices) {
    int len = prices.length;
    if(len==1){
      return 0;
    }
    int maxProfit = 0;
    int p1 = 0, p2 = 1;
    while (p2!=len) {
      if(prices[p1]>=prices[p2]){
        p1=p2;
        p2++;
      }else{
        int profit = prices[p2] - prices[p1];
        if (profit > maxProfit) {
          maxProfit = profit;
        }
        p2++;
      }
    }
    return maxProfit;
  }
}
