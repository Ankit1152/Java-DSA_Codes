public class BuySellStocks {
    public static int buySellStocks(int prices[]){
        // int buyPrice = Integer.MAX_VALUE;
        // int maxProfit = 0;
        // for(int i=0; i<prices.length; i++){
        //     if(buyPrice < prices[i]){
        //         int profit = prices[i]-buyPrice;
        //         maxProfit = Math.max(profit,maxProfit);
        //     }else{
        //         buyPrice = prices[i];
        //     }
        // }
        // return maxProfit;

        int buyPrice = prices[0];
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(buyPrice < prices[i]){
                profit = Math.max(prices[i] - buyPrice , profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buySellStocks(prices));
    }
}
