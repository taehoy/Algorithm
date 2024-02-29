public class Solution {
    public int solution(int n) {
        // 각 자리수 나누기 - n % 10이용
        int sum = 0;
        while(true){
            sum += n % 10;
            if(n < 10) break;
            n = n / 10;
        }
        
        return sum;
        
    }
}