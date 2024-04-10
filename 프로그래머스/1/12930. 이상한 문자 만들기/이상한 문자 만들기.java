class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.toLowerCase().split("");
        int cnt =0;
        
        // strArr의 값을 answer에 추가한다.
        for(String ss : strArr){
            cnt = ss.contains(" ") ? 0 : cnt+1;
            answer += cnt % 2 == 0 ? ss : ss.toUpperCase();
        }
        
        return answer;
    }
}