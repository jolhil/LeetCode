class Solution {
    public int removeDuplicates(int[] nums) {
        // if nums length is greater than 0 == nums is not empty, i = 1, otherwise i = 0;
        int i = nums.length > 0? 1 : 0;
        
        // for each loop to read all elements in the nums.
        for(int n : nums){
            // i = 1 since if nums is empty, for each loop does not start.
            if (n > nums[i-1])
                // new unique number is detected.
                nums[i++] = n;
        }
        return i;
        
    }
}