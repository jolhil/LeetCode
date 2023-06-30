class Solution {
    public int romanToInt(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            char next = ' ';
            if (i != s.length() - 1) {
                next = s.charAt(i +1);
            }
            switch (current) {
                case 'M':
                    n += 1000;
                    break;
                case 'D':
                    n += 500;
                    break;
                case 'C':
                    if (next == 'M') {
                        n += 900;
                        i++;
                        break;
                    } else if (next == 'D') {
                        n += 400;
                        i++;
                        break;
                    } else {
                        n += 100;
                        break;
                    }
                case 'L':
                    n += 50;
                    break;
                case 'X':
                    if (next == 'C') {
                        n += 90;
                        i++;
                        break;
                    } else if (next == 'L') {
                        n += 40;
                        i++;
                        break;
                    } else {
                        n += 10;
                        break;
                    }
                case 'V':
                    n += 5;
                    break;
                case 'I':
                    if (next == 'X') {
                        n += 9;
                        i++;
                        break;
                    } else if (next == 'V') {
                        n += 4;
                        i++;
                        break;
                    } else {
                        n += 1;
                        break;
                    }
            }
        }
        return n;
    }
}