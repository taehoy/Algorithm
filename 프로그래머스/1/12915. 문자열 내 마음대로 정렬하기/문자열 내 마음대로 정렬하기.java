import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        // strings의 n번재 글자 + strings[i] 넣는다.
        for(int i=0; i<strings.length; i++){
            answer[i] = strings[i].charAt(n) + strings[i];
        }
        
        Arrays.sort(answer);
        
        for(int i=0; i<answer.length; i++){
            answer[i] = answer[i].substring(1);
        }
        
        return answer;
    }
}