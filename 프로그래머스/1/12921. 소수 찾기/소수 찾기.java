class Solution {
    // 소수 찾는 메서드
    public static boolean isPrime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)) answer ++;
        }
        return answer;
    }
}