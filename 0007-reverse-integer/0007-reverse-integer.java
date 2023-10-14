class Solution {
    public int reverse(int x) {
        
        long reverse=0;
        int remainder;

        while (x!=0) {
            remainder=x%10;
            reverse=reverse*10+remainder;
            x=x/10;
        }
        if(reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE)
            return 0;
        return (int)reverse;
    }
}