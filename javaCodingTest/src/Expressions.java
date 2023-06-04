public class Expressions {
    public int expressions(int n) {
        int answer = 0;
        int temp = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (temp == n) {
                    answer++;
                    break;
                }
                else if (temp > n) {
                    break;
                }
                temp = temp + j;
            }
            temp = 0;
        }

        return answer + 1;
    }

    public void solution() {
        System.out.println("숫자의 표현");

        System.out.println(expressions(15));
    }
}

