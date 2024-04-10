import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0) +1);
        }
        
        // 완주자가 있으면 player key의 값 -1
        for(String player : completion){
            map.put(player, map.get(player)-1);
        }
        
        // key의 값이 1인 그사람이 바로 미완주자
        for(String player : map.keySet()){
            if(map.get(player) == 1) answer = player;
        }
        
        return answer;
    }
}