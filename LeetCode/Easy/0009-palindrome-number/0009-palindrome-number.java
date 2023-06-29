class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        // char[] n = ("" + x).toCharArray();
        // int l = n.length - 1;
        // for (int i = 0; i < n.length/2; i++) {
        //     if (n[i] != n[l-i]) {
        //         return false;
        //     }
        // }
        // return true;
        int c = x;
        int r = 0;
        int ten = 10;
        
        while(c > 0) {
            r = r*ten + c%ten;
            c /= ten;
        }
        return r == x;
        
    }
}