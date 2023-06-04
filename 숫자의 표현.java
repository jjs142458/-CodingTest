class Solution {
    public int solution(int n) {
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
}