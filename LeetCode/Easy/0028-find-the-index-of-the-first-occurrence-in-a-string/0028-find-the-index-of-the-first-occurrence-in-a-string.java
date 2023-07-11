class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                index = i;
                for(char c : needle.toCharArray()) {
                    if (i == haystack.length() || c != haystack.charAt(i++)) {
                        i = index;
                        index = -1;
                        break;
                    }
                }
                if (index != -1) {
                    break;
                }
            }
        }
        return index;
    }
}