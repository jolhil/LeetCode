class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case '{':
                    stack.push(c);
                    break;
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek() =='(') {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }
                case '}':
                    if(!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }
                case ']':
                    if(!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }
            }
        }
        return stack.empty();
    }
}