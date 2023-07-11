class Solution {
    public int strStr(String haystack, String needle) {
        int index = 0;
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(index)) {
                index++;
            } else {
                i -= index;
                index = 0;
            }
            if (index == needle.length()) {
                return i - index + 1;
            }
        }
        return -1;
    }
}