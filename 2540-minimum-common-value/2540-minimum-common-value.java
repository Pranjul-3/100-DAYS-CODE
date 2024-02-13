class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
    int l=0;int h=0;
        
        while(l<nums1.length && h<nums2.length){
            if(nums1[l]==nums2[h]){
                return nums1[l];
            }
            else{
                if(nums1[l]<nums2[h]){
                    l++;
                }
                else{
                    h++;
                }
            }
        }
        return -1;
    }
}