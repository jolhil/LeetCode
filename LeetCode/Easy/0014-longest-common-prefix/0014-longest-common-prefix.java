import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        int size = strs.length;
        
        for (int i = 1; i < size; i++) {
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length()-1);
            }
            if (result.isEmpty()) {
                break;
            }
        }
        
        return result;
    }
}