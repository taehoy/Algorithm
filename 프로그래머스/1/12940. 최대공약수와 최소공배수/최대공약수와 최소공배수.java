class Solution {
    public int[] solution(int n, int m) {
        // n과 m중 큰수, 작은수 만든다.
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        return new int[]{gcd(max, min), lcm(max, min)};
    }
    
    // 최대공약수 메서드 생성
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b , a%b);
    }
        
    // 최소공배수 메서드 생성 
    public int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}
