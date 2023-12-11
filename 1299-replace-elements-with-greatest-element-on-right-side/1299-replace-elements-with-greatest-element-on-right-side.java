class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        int length=arr.length;
        int[] nums= new int[length];

        for(int i=length-1;i>=0;i--){
            nums[i]= max;
            max = Math.max(arr[i] , max);  
        }
        return nums;
    }
}