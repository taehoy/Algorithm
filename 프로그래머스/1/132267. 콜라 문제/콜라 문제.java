class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        return recursion(a, b, n, 0);
    }
    
    public int recursion(int a, int b, int n, int result){
        if(n < a){
            return result;
        }
        result += (n / a) * b;
        n = ((n / a) *b) + (n % a);
        return recursion(a, b, n, result);
    }
}