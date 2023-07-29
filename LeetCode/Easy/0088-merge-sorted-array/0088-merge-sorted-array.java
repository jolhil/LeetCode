class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Begin with the largest values of two arrays to be compared
        // which avoid extra manipulation for the nums1 values.
        
        /** i for the index of the largest value of the nums1, j for the nums2, k for the final nums1 */
        int i = m - 1, j = n - 1, k = m + n - 1;
        
        // Using nums2 index for the while loop since nums1 values already in the nums1
        while(j >= 0) {
            if(i >= 0)
                nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
            else
                nums1[k--] = nums2[j--];
        }
        
    }
}