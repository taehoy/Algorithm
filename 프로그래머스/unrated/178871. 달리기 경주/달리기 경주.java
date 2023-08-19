import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playersMap = new HashMap<>();
        
        // Map에다가 players를 넣어
        for(int i=0; i<players.length; i++) 
            playersMap.put(players[i], i+1);
        
        
        // 만든 맵에서 해당하는 플레이어의 이름을 과 call이름의 index를 비교하여 둘이 바꿔
        for(int i=0; i<callings.length; i++) {
            String temp = players[playersMap.get(callings[i])-2];
            players[playersMap.get(callings[i])-2] = players[playersMap.get(callings[i])-1];
            players[playersMap.get(callings[i])-1] = temp;
            
            // hashMap에 있는 위치도 바꿔
            playersMap.put(callings[i], playersMap.get(callings[i])-1);
            playersMap.put(temp, playersMap.get(temp)+1);
        }
        
    
        return players;
    }
}