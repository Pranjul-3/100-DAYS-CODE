class Solution {
    public int averageValue(int[] nums) {
        int c = 0, s = 0;

        for (int n : nums) {
            if (n % 2 == 0 && n % 3 == 0) {
                c++;
                s += n;
            }
        }

        
        if (c != 0) {
            return s / c;
        } else {
            
            return 0; 
        }
    }
}
