class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m= nums2.length;
        int c=0;
        int a []=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums1[i]==nums2[j])
                {
                   c++; 
                    break;
                }
            }
        }
        a[0]=c;
        c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums1[j]==nums2[i])
                {
                   c++; 
                    break;
                }
            }
        }
        a[1]=c;
        return a;
    }
}