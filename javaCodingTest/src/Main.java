import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Expressions expressions = new Expressions();
        Bracket bracket = new Bracket();
        Caesar caesar = new Caesar();
        Ternary ternary = new Ternary();
        Secret secret = new Secret();

        expressions.solution(); // 4
        bracket.solution(); // true true false false
        caesar.solution(); // BC b C a
        ternary.solution(); // 7 229
        secret.solution(); // [#####, # # #, ### #, #  ##, #####] [######, ###  #, ##  ##,  #### ,  #####, ### # ]

    }
}

