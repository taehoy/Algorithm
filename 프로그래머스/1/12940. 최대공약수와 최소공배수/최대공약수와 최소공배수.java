class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n,m); // n, m 중 최대값
        int min = Math.min(n,m); // n, m 중 최소값
        int[] answer = {gcd(max, min), lcm(max, min)}; // 리턴 값 배열 넣기
        
        return answer;
    }
    
    //최대공약수 구하기 - 유클리드 호제법(재귀함수 사용)
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    
    //최소공배수 구하기 -> 최소공배수 * 최대공약수 = a * b 이용
    public int lcm(int a, int b){
        return a*b / gcd(a, b);
    }
}