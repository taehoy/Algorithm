import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 참가자 map 생성
        Map<String, Integer> map = new HashMap<>();
        
        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        // 완주자 처리
        for(String player : completion){
            map.put(player, map.get(player) -1);
        }
        
        // 미완주자 찾기
        for(String player : map.keySet()){
            if(map.get(player) == 1) return player;
        }
        
        return null;
    }
}