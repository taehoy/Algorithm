class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char ch = s.charAt(0);
        int count = 0;
        
        for(char c : s.toCharArray()){
            if(count == 0){
                ch = c;
            } 
            if(ch == c){
                count++;
            } else {
                count--;
            }
            if(count == 0){
                answer++;
            }
        }
        
        if(count > 0) {
            answer++;
        };
        
        return answer;
    }
}