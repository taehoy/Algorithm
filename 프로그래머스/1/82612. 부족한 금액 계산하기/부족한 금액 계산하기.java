class Solution {
    public long solution(int price, int money, int count) {
        // 1. 놀이기구 사용료 계산
        long total = 0;
        for(int i=0; i<count; i++){
            total += price + price*i;
        }
        
        // 2. 자금과 사용료 차이 계산 
        if(total > money) {
            return total-money;
        } else {
            return 0;
        }
    }
}