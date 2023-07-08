class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        int prev = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (prev != nums[i]){
                ans.add(nums[i]);
                prev = nums[i];
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            nums[i] = ans.get(i);
        }
        return ans.size();
    }
}