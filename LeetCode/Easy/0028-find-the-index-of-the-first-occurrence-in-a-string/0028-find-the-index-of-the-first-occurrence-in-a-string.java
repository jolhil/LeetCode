class Solution {
    public int strStr(String haystack, String needle) {
        int nl = needle.length();
        if(haystack.equals(needle)) return 0;
        for(int i = 0; i + nl <= haystack.length(); i++){
            String s = haystack.substring(i, i+nl);
            if(s.equals(needle)) return i;
        }
        return -1;
    }

}