class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int x=purchaseAmount%10;
        int s=0;
        if(x>=5)
        {
            s=purchaseAmount+(10-x);
        }
        else
        s=purchaseAmount-x;

        return 100-s;
    }
}
    