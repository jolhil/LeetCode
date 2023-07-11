class Solution {
    public int strStr(String haystack, String needle) {
        int wl = needle.length();
        if(haystack.equals(needle)) return 0;
        for(int i = 0; i + wl <= haystack.length(); i++){
            String s = haystack.substring(i, i+wl);
            if(s.equals(needle)) return i;
        }
        return -1;
    }
}