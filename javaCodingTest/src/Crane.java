import java.util.Stack;

public class Crane {
    public int crane(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int number : moves) {
            int move = number -1;

            for (int i = 0; i < board.length; i++) {

                if (board[i][move] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[i][move]) {
                        answer = answer + 2;
                        stack.pop();
                    }
                    else {
                        stack.push(board[i][move]);
                    }

                    board[i][move] = 0;
                    break;
                }
            }

        }

        return answer;
    }

    public void solution() {
        System.out.println("크래인 인형뽑기");

        int[][] a = {{0, 0, 0, 0, 0},{0, 0, 1, 0, 3},{0, 2, 5, 0, 1},{4, 2, 4, 4, 2},{3, 5, 1, 3, 1}};
        int[] b = {1,5,3,5,1,2,1,4};
        System.out.println(crane(a,b));
    }

}
