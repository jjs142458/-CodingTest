import java.util.Arrays;

public class Secret {

    public String[] secret(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);

            if (answer[i].length() < n) {
                String z = "0";
                int temp = n - answer[i].length();
                answer[i] = z.repeat(temp) + answer[i];

            }
        }

        for (int i = 0; i < n; i++) {
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }

        return answer;
    }

    public void solution() {
        System.out.println("비밀지도");

        int[] a = {9, 20, 28, 18, 11};
        int[] b = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(secret(5, a, b)));
        a = new int[]{46, 33, 33, 22, 31, 50};
        b = new int[]{27, 56, 19, 14, 14, 10};

        System.out.println(Arrays.toString(secret(6,a,b)));
    }
}
