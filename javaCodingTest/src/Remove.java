import java.util.Stack;

public class Remove {

    public int remove(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!stack.empty() && stack.peek() == s.charAt(i)) stack.pop();
            else stack.push(s.charAt(i));
        }

        if (stack.empty()) return 1;

        return 0;
    }

    public void solution() {
        System.out.println("짝지어 제거하기");

        System.out.println(remove("baabaa"));
        System.out.println(remove("cdcd"));
    }
}
