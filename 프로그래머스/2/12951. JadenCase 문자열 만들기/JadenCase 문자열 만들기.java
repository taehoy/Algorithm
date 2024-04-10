class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.toLowerCase().split("");
        boolean flag = true; // 첫문자는 무조건 대문자
        
        for(String ss : strArr){
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }
        
        return answer;
    }
}