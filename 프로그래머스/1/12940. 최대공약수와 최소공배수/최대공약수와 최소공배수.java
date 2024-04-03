class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n,m);
        int min = Math.min(n,m);
            
        return new int[]{gcd(max, min), lcm(max, min)};
    }
    
    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    
    public int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
    
}