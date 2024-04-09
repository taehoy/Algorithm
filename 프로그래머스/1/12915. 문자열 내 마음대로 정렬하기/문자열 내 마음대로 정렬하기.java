import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        
        
        // 문자열 배열 돌면서 n번째 문자끼리 크기비교하기
        Arrays.sort(strings);
        for(String s : strings){
            System.out.println("s : " + s);
        }

        for(int i=0; i<answer.length; i++){
            answer[i] = strings[i].charAt(n) + strings[i];
        }
        
        Arrays.sort(answer);
        
        for(int i=0; i<answer.length; i++){
            answer[i] = answer[i].substring(1);
        }
        
        for(String s : answer){
            System.out.println(s);
        }
        
        
        return answer;
    }
}