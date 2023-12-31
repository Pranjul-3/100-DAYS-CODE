class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int x=purchaseAmount%10;
        int sum=0;
        if(x<5)
        {
            sum=purchaseAmount-x;
        }
        else
        sum=purchaseAmount+(10-x);

        return 100-sum;
    }
}
    