import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //Map 만들기
        Map<String, Integer> map = new HashMap<>();
        
        //Map에 참가자 넣기
        for(String s : participant){
            map.put(s , map.getOrDefault(s, 0) + 1);
        }
        
        //Map에 완주자 넣기
        for(String s : completion){
            map.put(s , map.get(s) - 1);
        }
        
        //Map의 남은 사람 찾기
        for(String player : map.keySet()){
            if(map.get(player) == 1) answer = player;
        }
        
        return answer;
    }
}