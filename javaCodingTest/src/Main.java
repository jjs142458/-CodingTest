import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Expressions expressions = new Expressions(); // 숫자의 표현
        Bracket bracket = new Bracket(); // 올바른 괄호
        Caesar caesar = new Caesar(); // 시저 암호
        Ternary ternary = new Ternary(); // 3진법 뒤집기
        Secret secret = new Secret(); // 비밀지도

        expressions.solution(); // 4
        bracket.solution(); // true true false false
        caesar.solution(); // BC b C a
        ternary.solution(); // 7 229
        secret.solution(); // [#####, # # #, ### #, #  ##, #####] [######, ###  #, ##  ##,  #### ,  #####, ### # ]

    }
}

