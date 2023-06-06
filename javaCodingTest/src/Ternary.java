import java.util.Stack;

public class Ternary {

    public int ternary(int n) {

        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int size;

        while (n > 0) {    // 3진법 구하고 뒤집기
            stack.push(n%3);
            n /= 3;
        }

        size = stack.size();

        for (int i = 0; i < size; i++) {    //3진법 10진수로 변환
            answer += Math.pow(3,i) * stack.pop();
        }

        return answer;
    }

    public void solution() {
        System.out.println("3진법 뒤집기");
        System.out.println(ternary(45));
        System.out.println(ternary(125));
    }
}
