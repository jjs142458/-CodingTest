public class Solution {
    Expressions expressions = new Expressions(); // 숫자의 표현
    Bracket bracket = new Bracket(); // 올바른 괄호
    Caesar caesar = new Caesar(); // 시저 암호
    Ternary ternary = new Ternary(); // 3진법 뒤집기
    Secret secret = new Secret(); // 비밀지도
    Recommendation recommendation = new Recommendation(); // 신규 아이디 추천
    Crane crane = new Crane(); // 크레인 인형 뽑기
    Remove remove = new Remove(); // 짝지어 제거하기
    public void solution() {
        expressions.solution(); // 4
        bracket.solution(); // true true false false
        caesar.solution(); // BC, b C a
        ternary.solution(); // 7, 229
        secret.solution(); // [#####, # # #, ### #, #  ##, #####] [######, ###  #, ##  ##,  #### ,  #####, ### # ]
        recommendation.solution(); // bat.y.abcdefghi, abcdefghijklmn
        crane.solution(); // 4
        remove.solution(); // 1 0
    }




}
