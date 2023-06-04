import java.util.Stack;
class Bracket {
    boolean bracket(String s) {
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

    public void solution() {
        System.out.println("올바른 괄호");
        System.out.println(bracket("()()"));
        System.out.println(bracket("(())()"));
        System.out.println(bracket(")()("));
        System.out.println(bracket("(()("));
    }
}