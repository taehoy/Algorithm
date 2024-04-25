class Solution {
    static int a;
    static int b;
    static int n;
    
    public int recursion(int n, int answer){
        // 탈출 조건
        if(n < a) return answer;
            
        // 동작 구현
        // 받는 병수 (n / a) * b
        answer += (n / a) * b;
        n = (n/a * b) + (n % a); 
        
        return recursion(n, answer);
    }
    
    public int solution(int a, int b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
        
        return recursion(n, 0);
    }
}