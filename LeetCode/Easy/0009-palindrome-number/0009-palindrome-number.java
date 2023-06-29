class Solution {
    public boolean isPalindrome(int x) {
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