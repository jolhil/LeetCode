class Solution {
    public int lengthOfLastWord(String s) {
        String[] stringArray = s.split(" ");
        String last = stringArray[stringArray.length - 1];
        
        return last.length();
        
    }
}