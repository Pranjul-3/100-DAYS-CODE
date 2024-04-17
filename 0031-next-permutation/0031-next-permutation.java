class Solution {
    public void reverse(int i,int j,int [] nums)
    { 
      
        while(i<=j)
        {
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

    }
    public void nextPermutation(int[] nums) {
        //[1,2,3,6,5,4]  [1,1]
        int index=-1;
        for(int i=nums.length-1;i>=1;i--)
        {
            if(nums[i]>nums[i-1])
            {
                index= i-1;
                break;
            }
        }
        // kuch chota element mila hi nahi hai  means descending order h
        if(index==-1)
        {
            // reverse// 
          reverse(0,nums.length-1,nums);
        }
        // index mil gaya 
        // step 2: sort the array 
                   // swapping 
       else{ reverse(index+1,nums.length-1,nums);

        for(int i=index+1;i<nums.length;i++)
        {
            if(nums[index]<nums[i])
            {                                     
                int temp = nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        }
        //print Next permutation //
        for(Integer ele : nums)
        {
            System.out.print(ele+" ");
        }
    }
}
