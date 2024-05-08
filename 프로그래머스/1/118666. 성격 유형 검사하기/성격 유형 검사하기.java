import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[][] type = {{'R','T'}, {'C', 'F'}, {'J','M'}, {'A','N'}};
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(char[] arr : type){
            map.put(arr[0],0);
            map.put(arr[1],0);
        }
        
        for(int i=0; i<survey.length; i++){
            char c1 = survey[i].charAt(0);
            char c2 = survey[i].charAt(1);
            if(1<= choices[i] && choices[i] <= 3){
                map.put(c1, map.getOrDefault(c1,0) + 4 - choices[i]);
            } else if(5 <= choices[i] && choices[i] <= 7){
                map.put(c2, map.getOrDefault(c2,0) + choices[i] -4);
            }
        }
        
        // 최종 성격 유형 
        StringBuilder sb = new StringBuilder();
        
        if(map.get('R') >= map.get('T')) sb.append("R");
        else sb.append("T");
        if(map.get('C') >= map.get('F')) sb.append("C");
        else sb.append("F");
        if(map.get('J') >= map.get('M')) sb.append("J");
        else sb.append("M");
        if(map.get('A') >= map.get('N')) sb.append("A");
        else sb.append("N");
        
        return sb.toString();
    }
}