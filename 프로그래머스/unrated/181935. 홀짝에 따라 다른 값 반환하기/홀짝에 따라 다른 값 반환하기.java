class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0) {
            // 짝수
            for(int i=0; i<=n/2; i++) {
                answer += Math.pow(i*2, 2);
            }
            return answer;
        } else // 홀수
        {
            for(int i=0; i<=n/2; i++){
                answer += 2*i + 1;
            }
            return answer;
        }
    }
}