class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0; // 돌려받은 개수 변수
        
        // n을 a로 나눈다.
        while(n / a >= 1){
            int getNum = (n / a) * b; // 받은 콜라 수 
            
            System.out.println("받은 콜라 수 : " + getNum);
            System.out.println("가지고 있는 콜라 병 수 : " + (n/a) + (n%a));
            answer += getNum; // 돌려받은 개수 변수에 추가
            n = getNum + n % a;
        }
        
        return answer;
    }
}