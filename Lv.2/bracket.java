import java.util.Stack;
class bracket {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();
  
        if (s.charAt(0) == ')' || s.charAt(s.length() -1)  == '(') return false;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push("(");
            }
            else if (stack.empty()) {
                return false;
            }
            else {
                stack.pop();
            }
        }
        
                 
        return stack.empty();
    }
}