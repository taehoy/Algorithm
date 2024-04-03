class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int cnt = 0;
        
        for(String ss : arr){
            if(ss.equals(" ")) {
                answer += " ";
                cnt = 0;
                continue;
            }
            answer += (cnt%2 == 0) ? ss.toUpperCase() : ss.toLowerCase();
            cnt++;
        }
        
        return answer;
    }
}