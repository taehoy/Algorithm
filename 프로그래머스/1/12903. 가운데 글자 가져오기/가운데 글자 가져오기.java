class Solution {
    public String solution(String s) {
        String answer = "";
        int size = s.length();
        char[] ch = s.toCharArray();
        //1. 홀수 or 짝수
        if(size % 2 == 0) {
            answer += ch[size/2-1];
            answer += ch[size/2];
        } else {
            answer += ch[size/2];
        }
        return answer;
    }
}