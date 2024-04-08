class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                answer += " ";
            } else if('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
                int sumCh = s.charAt(i) + n;
                if(sumCh > 'z'){
                    sumCh -= 26;
                    answer += (char)sumCh;
                } else {
                    answer += (char)sumCh;    
                }
            } else {
                int sumCh = s.charAt(i) + n;
                if(sumCh > 'Z'){
                    sumCh -= 26;
                    answer += (char)sumCh;
                } else {
                    answer += (char)sumCh;
                }
            }
        }
        
        return answer;
    }
}