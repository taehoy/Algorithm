class Solution {
    public int solution(int n) {
        int i=1;
        
        // n을 x로 나누었을때, 1이 될때까지 반복
        while(n % i != 1){
            i++;
        }
        
        return i;
    }
}