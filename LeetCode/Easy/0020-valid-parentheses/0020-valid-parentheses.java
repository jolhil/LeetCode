class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            } else if (stack.isEmpty()) {
                return false;
            } else {
                switch (c) {
                    case ')':
                        if (stack.pop() != '(') return false;
                        break;
                    case '}':
                        if(stack.pop() != '{') return false;
                        break;
                    case ']':
                        if(stack.pop() != '[') return false;
                        break;
                    default:
                        return false;
                }
            }
        }
            
        return stack.empty();
    }
}