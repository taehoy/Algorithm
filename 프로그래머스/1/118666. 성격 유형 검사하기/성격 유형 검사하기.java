import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        
        Map<Character, Integer> map = new HashMap<>();
        
        // 성격 유형 결과지 만들기
        map.put('R',0);
        map.put('T',0);
        map.put('C',0);
        map.put('F',0);
        map.put('J',0);
        map.put('M',0);
        map.put('A',0);
        map.put('N',0);
        
        // 점수 매기기
        for(int i=0; i<survey.length; i++){
            if(1 <= choices[i] && choices[i] <= 3){
                map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + 4-choices[i]);
            } else if(5 <= choices[i] && choices[i] <= 7){
                map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + (choices[i]-4));
            } 
        }
        
        // 최종 점수 비교
        if(map.get('R') >= map.get('T')) sb.append("R");
        else if(map.get('R') < map.get('T')) sb.append("T");

        if(map.get('C') >= map.get('F')) sb.append("C");
        else sb.append("F");

        if(map.get('J') >= map.get('M')) sb.append("J");
        else sb.append("M");

        if(map.get('A') >= map.get('N')) sb.append("A");
        else sb.append("N");
        
        
        return sb.toString();
    }
}