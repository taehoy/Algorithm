import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i],0) +1);
        }

        for(String player : completion){
            map.put(player, map.get(player)-1);
        }
        
        String answer = "";
        
        for (String s : map.keySet()){
            if(map.get(s) == 1){
                answer = s;
                break;
            }
        }
        
        return answer;
    }
}