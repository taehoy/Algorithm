class Solution {
    public int solution(long num) {
        int count = 0;
        
        if(num ==1){
            count = 0;
        }
        
        while(num != 1) {
            // 입력된 수 짝수 -> 2 나누기
            if(num % 2 == 0) {
                num = num / 2;
            } else {  // 홀수 -> 3곱하고 1더하기
                num = num * 3 + 1;
            }
            
            count ++;
            if(count == 500){
                count = -1;
                break;
            }
        }
        return count;
    }
}