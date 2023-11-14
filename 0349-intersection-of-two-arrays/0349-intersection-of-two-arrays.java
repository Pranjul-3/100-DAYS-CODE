class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();

        int i = 0; // Pointer for nums1
        int j = 0; // Pointer for nums2

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // Found an intersection
                result.add(nums1[i]);

                // Move both pointers to avoid duplicate entries
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                // Move the pointer for nums1
                i++;
            } else {
                // Move the pointer for nums2
                j++;
            }
        }

        // Convert the result list to an array
        int[] resultArray = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            resultArray[k] = result.get(k);
        }

        // Remove duplicates in the resultArray
        int c = 1;
        Arrays.sort(resultArray);
        for (int k = 1; k < resultArray.length; k++) {
            if (resultArray[k] != resultArray[k - 1]) {
                resultArray[c] = resultArray[k];
                c++;
            }
        }

        // Check if resultArray is empty
        if (resultArray.length == 0) {
            return new int[]{};
        }

        // Create a new array with unique elements
        int[] uniqueArray = Arrays.copyOf(resultArray, c);

        return uniqueArray;
    }
}
    
