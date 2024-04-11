class Solution {
    int[] numbers;
    int target;
    int answer;
    
    void dfs(int index, int sum){
        // 탈출 조건
        if(index == numbers.length){
            if(sum == target) answer++;
            return;
        }
        
        // 동작 구현
        dfs(index+1, sum+numbers[index]); // 더하기
        dfs(index+1, sum-numbers[index]); // 빼기
    }
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;
        
        dfs(0,0);
        
        return answer;
    }
    
    
}