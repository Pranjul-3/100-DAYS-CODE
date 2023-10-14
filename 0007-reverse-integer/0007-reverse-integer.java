class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int remainder = x % 10;
            if (reverse>2147483647/10  || reverse<-2147483647/10)
            {
                return 0;
            }
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }
        return reverse;
    }
}
