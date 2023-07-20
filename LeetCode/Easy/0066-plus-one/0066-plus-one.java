class Solution {
    public int[] plusOne(int[] digits) {
        int nine = 9;
        int ten = 10;
        int last = digits.length - 1;
        digits[last]++;
        
        
        for(int i = digits.length - 1; i >=0; i--) {
            if(digits[i]> nine) {
               if (i == 0) {
                   int[] newDigits = new int[digits.length + 1];
                   newDigits[0] = 1;
                   digits[i] -= ten;
                   for(int j = 0; j < digits.length; j++) {
                        newDigits[j+1] = digits[j];
                   }
                   return newDigits;
               } else {
                   digits[i-1]++;
                   digits[i] -= ten;
               }
            }
        }
        
        return digits;
    
    }
}