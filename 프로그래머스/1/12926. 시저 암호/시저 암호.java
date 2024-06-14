import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                sb.append(c);
                continue;
            }
            
            // 소문자
            if('a'<=c && c<='z'){
                // 'z' 초과
                if(c + n >'z'){
                    sb.append((char)(c + n - 26));
                } else {
                    sb.append((char)(c+n));
                }
            } else { // 대문자
                // 'Z' 초과
                if(c + n >'Z'){
                    sb.append((char)(c + n - 26));
                } else {
                    sb.append((char)(c+n));
                }
            }
        }
        
        return sb.toString();
    }
}