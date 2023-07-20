class Solution {
    public int[] plusOne(int[] digits) {
        int nine = 9;
        int ten = 10;
        
        for(int i = digits.length - 1; i >=0; i--) {
            if(digits[i] < nine) {
               digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        digits = new int[digits.length + 1];
        digits[0] = 1;
        
        return digits;
    
    }
}