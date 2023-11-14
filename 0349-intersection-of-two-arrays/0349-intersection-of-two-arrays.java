class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> res = new ArrayList<>();

        int i = 0; 
        int j = 0; 

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                
                res.add(nums1[i]);
                i++;
                j++;
            } 
            else if (nums1[i] < nums2[j])
            {
                i++;
            } 
            else 
            {
                
                j++;
            }
        }

       
        int[] a = new int[res.size()];
        for (int k = 0; k < res.size(); k++) {
            a[k] = res.get(k);
        }

        
        int c = 1;
        Arrays.sort(a);
        for (int k = 1; k < a.length; k++) {
            if (a[k] != a[k - 1]) {
            a[c] = a[k];
                c++;
            }
        }

        
        if (a.length == 0) 
        {
            return new int[]{};
        }

        
        int[] b = Arrays.copyOf(a, c);

        return b;
    }
}
    
