class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        // s의 길이만큼 순회한다.
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            // 공백이면 공백 추가
            if(ch == ' ') {
                answer += ch;
                continue;
            }
            
            if('a' <= ch && ch <= 'z'){
                if(ch + n > 'z'){
                    answer += (char)(ch + n - 26);
                } else {
                    answer += (char)(ch + n);
                }
            } else if('A' <= ch && ch <= 'Z'){
                if(ch + n > 'Z'){
                    answer += (char)(ch + n - 26);
                } else {
                    answer += (char)(ch + n);
                }
            }
        }
        return answer;
    }
}