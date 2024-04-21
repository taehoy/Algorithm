class Solution {
    public String solution(String s) {
        String answer = "";
        boolean flag = true; // 첫문자는 무조건 대문자
                
        String[] strArr = s.toLowerCase().split("");
        
        for(String ss : strArr){
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }
        
        return answer;
    }
}