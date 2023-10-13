class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a [] = new int[nums1.length+nums2.length];
        for(int i=0; i<nums1.length; i++)
        {
            a[i]=nums1[i];
        }
        for(int i=nums1.length; i<a.length; i++)
        {
            a[i]=nums2[i-nums1.length];
        }
        Arrays.sort(a);
        if(a.length%2!=0)
        {
           double f = a[(a.length-1)/2];
            return f;
            
        }
        else
        {
          double b = a[a.length/2];
            double c = a[(a.length/2)-1];
            double k = (b+c)/2;
            return k;
            
        }
        
    }
}

