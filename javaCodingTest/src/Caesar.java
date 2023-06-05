public class Caesar {

    // 대문자 65 ~ 90
    // 소문자 97 ~ 122

    public String caesar(String s, int n) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        int transWordNum;

        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);

            if (Character.isUpperCase(word)) {
                transWordNum = ((int) word + n)%'A';
                sb.append((char) ('A' + (transWordNum % 26)));
            }
            else if (Character.isLowerCase(word)) {
                transWordNum = ((int) word + n)%'a';
                sb.append((char) ('a' + (transWordNum % 26)));
            }
            else {
                sb.append(" ");
            }
        }

        answer = sb.toString();

        return answer;
    }

    public void solution() {
        String a = "AB";
        String b = "a B z";
        System.out.println("시저 암호");
        System.out.println(caesar(a,1));
        System.out.println(caesar(b,1));
    }
}
