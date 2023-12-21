class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum=0;
        for(int i=0;i<2;i++)
        {
            sum=sum+prices[i];
        }
        if(money-sum>=0)
        {
          return money-sum;
        }
        return money;
    }
}






/**class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        return prices[0] + prices[1] <= money?money - (prices[0] + prices[1]):money;
    }
}**/