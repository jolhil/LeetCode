class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int prev = 0;
        
        Map<Character, Integer> romanIntMap = new HashMap<>();
        romanIntMap.put('I', 1);
        romanIntMap.put('V', 5);
        romanIntMap.put('X', 10);
        romanIntMap.put('L', 50);
        romanIntMap.put('C', 100);
        romanIntMap.put('D', 500);
        romanIntMap.put('M', 1000);
        
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            int n = romanIntMap.get(c);
            
            if (n < prev) {
                ans -= n;
            } else {
                ans += n;
            }
            prev = n;
        }
        return ans;
    }
}