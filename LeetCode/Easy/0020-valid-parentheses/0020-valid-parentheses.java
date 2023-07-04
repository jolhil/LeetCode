// class Solution {
//     public boolean isValid(String s) {

//         Stack<Character> stack = new Stack<Character>();
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (c == '(' || c == '{' || c == '[') {
//                 stack.push(c);
//                 continue;
//             } else if (stack.isEmpty()) {
//                 return false;
//             }
//             switch (c) {
//                 case ')':
//                     if (stack.peek() =='(') {
//                         stack.pop();
//                         break;
//                     } else {
//                         return false;
//                     }
//                 case '}':
//                     if(stack.peek() == '{') {
//                         stack.pop();
//                         break;
//                     } else {
//                         return false;
//                     }
//                 case ']':
//                     if(stack.peek() == '[') {
//                         stack.pop();
//                         break;
//                     } else {
//                         return false;
//                     }
//             }
//         }
//         return stack.empty();
//     }
// }
class Solution {
    public boolean isValid(String s) {
        // Create hashmap to store the pairs...
        HashMap<Character, Character> Hmap = new HashMap<Character, Character>();
        Hmap.put(')','(');
        Hmap.put('}','{');
        Hmap.put(']','[');
        // Create stack data structure...
        Stack<Character> stack = new Stack<Character>();
        // Traverse each charater in input string...
        for (int idx = 0; idx < s.length(); idx++){
            // If open parentheses are present, push it to stack...
            if (s.charAt(idx) == '(' || s.charAt(idx) == '{' || s.charAt(idx) == '[') {
                stack.push(s.charAt(idx));
                continue;
            }
            // If the character is closing parentheses, check that the same type opening parentheses is being pushed to the stack or not...
            // If not, we need to return false...
            if (stack.size() == 0 || Hmap.get(s.charAt(idx)) != stack.pop()) {
                return false;
            }
        }
        // If the stack is empty, return true...
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}