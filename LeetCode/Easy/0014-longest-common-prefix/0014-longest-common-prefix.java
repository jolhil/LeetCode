import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int size =strs.length;
        if (size == 0) {
            return "";
        } else if (size == 1) {
            return strs[0];
        }
        Arrays.sort(strs);
        int end = Math.min(strs[0].length(), strs[size-1].length());
        
        for (int i = 0; i < end; i++) {
            if (strs[0].charAt(i) != strs[size-1].charAt(i)) {
                break;
            } else {
                result = strs[0].substring(0, i+1);
            }
        }
        
        return result;
    }
}