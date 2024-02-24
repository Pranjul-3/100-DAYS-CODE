class Solution {
    public int mostFrequentEven(int[] nums) {
        
int temp[] = new int[100001];
        for(int i : nums) temp[i]++;
        int min = 100000 , freq = 0 , ans = -1;
        for(int i=0; i<temp.length; i++){
            if(i%2==0 && freq<temp[i]){
                freq = temp[i];
                ans = i;
            }
        }
        return ans;
    }
}