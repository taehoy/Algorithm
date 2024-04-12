class Solution {
    static int[] numbers;
    static int target;
    static int answer;
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        answer = 0;
        
        dfs(0,0);
        
        return answer;
    }
    
    public void dfs(int index, int result){
        // 탈출조건
        if(index == numbers.length){
            if(result == target) answer++;
            return;
        }
        
        // 동작 구현
        dfs(index+1, result+numbers[index]);
        dfs(index+1, result-numbers[index]);
    }
    
}