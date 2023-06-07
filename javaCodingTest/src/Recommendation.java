import java.util.ArrayList;
import java.util.List;


public class Recommendation {
    public String recommendation(String new_id) {

        new_id = new_id.toLowerCase(); // new_id 소문자로 치완

        new_id = new_id.replaceAll("[^a-z0-9-_.]", ""); // 특수문자 제거

        new_id = new_id.replaceAll("\\.{2,}","."); // .가 2번이상 반복될 시 .로 치환

        new_id = new_id.replaceAll("^\\.|\\.$", ""); // 첫번째 마지막 번째 . 제거

        if (new_id.isEmpty()) {     // new_id가 공백일때 a 추가
            new_id = "a";
        }

        if (new_id.length() > 15) { // new_id의 길이가 16자 이상일때, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
            new_id = new_id.substring(0, 15).replaceAll("\\.$", "");
        }

        while (new_id.length() < 3) { //길이가 2자 이하일때, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙임
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;

    }

    public void solution() {
        System.out.println("신규 아이디 추천");

        System.out.println(recommendation("...!@BaT#*..y.abcdefghijklm"));
        System.out.println("abcdefghijklmn.p");
    }
}
