//leetcode - 121
class Solution {
    public int maxProfit(int[] prices) {
        
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            int profit = prices[i] - minprice;
            if(prices[i] < minprice){
                minprice = prices[i];
            }
            
            else if(profit > maxprofit){
                maxprofit = prices[i] - minprice;
            }
//             minprice = Math.min(minprice,prices[i]);
//             maxprofit = Math.max(maxprofit,prices[i]-minprice);
            
        }
        return maxprofit;
        // int max = 0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[j] > prices[i]){
        //             int dif = prices[j] - prices[i];
        //             if(dif > max)
        //                 max = dif;
        //         }
        //     }
        // }
        // return max;
    }
}
