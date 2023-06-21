import java.util.Arrays;

public class CutArray {
    public int[] cutArray(int n, long left, long right) {
        int size = (int) (right - left + 1);
        int[] answer = new int[size];
        int index = 0;

        for (long i = left; i <= right; i++) {
            long row = i / n;
            long col = i % n;
            answer[index++] = Math.max((int) row, (int) col) + 1;
        }

        return answer;
    }

    public void solution() {
        System.out.println("n^2 배열 자르기");

        System.out.println(Arrays.toString(cutArray(3, 2, 5)));
    }
}
