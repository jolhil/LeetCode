class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                if (l == r) {
                    return nums.length;
                } else if (nums[m+1] > target) {
                    return m  + 1;
                } 
                l = m + 1;
            } else {
                if (m == 0) {
                    return 0;
                } else if (nums[m-1] < target) {
                    return m;
                }
                r = m -1;
            }
        }
        
        return 0;
    }
}