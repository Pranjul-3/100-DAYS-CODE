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











/**class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for(int num:nums)
            if (num%6==0) {
                sum += num;
                count++;
            }
        return count==0?0:Math.round(sum/count);
    }
}**/