import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>(); // 맵 선언
        
        // 맵에 참가자 넣기
        for(String s : participant){
            map.put(s, map.getOrDefault(s , 0) + 1);
        }
        
        // 완주자가 있으면 -1
        for(String s : completion){
            map.put(s, map.get(s) - 1);
        }
        
        // map의 key 중 1인 것 고르기
        for(String s : map.keySet()){
            if(map.get(s) ==1) answer = s;
        }
        
        return answer;
    }
}