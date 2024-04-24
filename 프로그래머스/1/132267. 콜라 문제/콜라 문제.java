class Solution {
    public int solution(int a, int b, int n) {
        // 받는 콜라 병수 int 변수
        int answer = 0;
        
        // 가지고 있는 병수(n)이 줘야하는 병수(a) 보다 작으면 끝. a>n
        while(a <= n){
            // 받는 병수 (n / a) * b
            int getedCoke = (n / a) * b;
            
            n = (n%a) + getedCoke;
            
            // 남은 병수(n) -> (n % a) + 받는 병수
            answer += getedCoke;
        }
        return answer;
    }
}