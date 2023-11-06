class Solution {
    public int[] twoSum(int[] numbers, int target) {
      // logic is applicable on sorted array    
        int f=0;
        int l=numbers.length-1;
        while(f<l)
        {
            if(numbers[f]+numbers[l]==target)
            {
                 return new int[] { f+1, l+1 };
            }
            else if(numbers[f]+numbers[l]<target)
            {
                 f++;
            }
            else
            {
                l--;
            }
        }
        return new int[] {-1,-1};
        
    }
}


                   

          
   