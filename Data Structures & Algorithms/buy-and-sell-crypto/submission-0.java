class Solution {
    public int maxProfit(int[] prices) {
        int current=prices[0];
       int maxProfit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<current)
            {
                current = prices[i];

            }
            else {
                maxProfit=Math.max(maxProfit,prices[i]-current);


            }




        }
        return maxProfit;
    }
}
