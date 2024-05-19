import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> keypad = new HashMap<>();
        
        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){
                char c = keymap[i].charAt(j);
                
                if(keypad.containsKey(c)){
                    int cnt = keypad.get(c);
                    keypad.put(c, Math.min(cnt, j+1));
                } else{
                    keypad.put(c, j+1);
                }
            }
        }
        
        for(int i=0; i<targets.length; i++){
            for(int j=0; j<targets[i].length(); j++){
                char c = targets[i].charAt(j);
                
                if(keypad.containsKey(c)){
                    answer[i] += keypad.get(c);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}