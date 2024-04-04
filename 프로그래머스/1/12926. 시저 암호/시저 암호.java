class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                answer += " ";
            } else if('a' <= s.charAt(i) && s.charAt(i) <='z'){
                int sumCh = s.charAt(i) +n;
                if( 'z' < sumCh){
                    sumCh -= 26;
                }
                char ch = (char)sumCh;
                answer += ch;
            } else {
                int sumCh = s.charAt(i) +n;
                if('Z' < sumCh){
                    sumCh -= 26;
                }
                char ch = (char)sumCh;
                answer += ch;
            }
        }
        return answer;
    }
}