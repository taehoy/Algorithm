class Solution {
    public int solution(int n) {
        // 약수구하기
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0)
                sum += i;
        }
        
        return sum;
        
    }
}