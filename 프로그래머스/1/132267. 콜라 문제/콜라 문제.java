class Solution {
    static int a;
    static int b;
    static int n;
    public int solution(int a, int b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
        
        return dfs(n,0);
    }
    
    public int dfs(int n, int result){
        // 탈출조건
        if(n < a) return result;
        
        // 동작 구현
        result += n/a * b;
        n = (n/a *b) + (n%a);
        return dfs(n, result);
    }
}