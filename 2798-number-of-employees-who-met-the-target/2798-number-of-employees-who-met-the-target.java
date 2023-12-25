class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        int c=0;
        for(int i=0;i<hours.length;i++)
        {
            if(hours[i]>=target)
            {
               c++;
            }
        }
        return c;
    }
}