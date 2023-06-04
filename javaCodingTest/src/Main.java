public class Main {
    public static void main(String[] args) {

        Expressions expressions = new Expressions();
        Bracket bracket = new Bracket();
        Caesar caesar = new Caesar();

        expressions.solution(); // 4
        bracket.solution(); // true true false false
        caesar.solution(); // BC b C a

    }
}


