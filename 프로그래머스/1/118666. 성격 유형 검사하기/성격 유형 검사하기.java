import java.util.*;

class Solution {
    public void makeResult(Map<Character, Integer>  map, StringBuilder sb){
        if(map.get('R') >= map.get('T')) sb.append("R");
        else if(map.get('R') < map.get('T')) sb.append("T");

        if(map.get('C') >= map.get('F')) sb.append("C");
        else sb.append("F");

        if(map.get('J') >= map.get('M')) sb.append("J");
        else sb.append("M");

        if(map.get('A') >= map.get('N')) sb.append("A");
        else sb.append("N");
    }
    
    public void writeScore(Map<Character, Integer> map, String[] survey, int[] choices){
        
        for(int i=0; i<survey.length; i++){
            char c1 = survey[i].charAt(0);
            char c2 = survey[i].charAt(1);
            
            if(1 <= choices[i] && choices[i] <= 3){
                map.put(c1, map.getOrDefault(c1, 0) + 4-choices[i]);
            } else if(5 <= choices[i] && choices[i] <= 7){
                map.put(c2, map.getOrDefault(c2, 0) + choices[i]-4);
            } 
        }
    }
    
    public Map makeScoreBorad(){
        Map<Character, Integer> map = new HashMap<>();
        
        char [][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        
        // 성격 유형 결과지 만들기
        for (char[] t : type) {
            map.put(t[0], 0);
            map.put(t[1], 0);
        }
        
        return map;
    }
    
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = makeScoreBorad();
        
        // 점수 매기기
        writeScore(map, survey, choices);
        
        
        // 최종 점수 비교
        StringBuilder sb = new StringBuilder();
        
        makeResult(map, sb);
        
        return sb.toString();
    }
}