class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        // String s = Integer.toString(x);
        char[] n = ("" + x).toCharArray();
        int l = n.length - 1;
        for (int i = 0; i < n.length/2; i++) {
            if (n[i] != n[l]) {
                return false;
            }
            l--;
        }
        return true;
        
    }
}