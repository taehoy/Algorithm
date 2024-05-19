import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){
                char c = keymap[i].charAt(j);
                if(map.containsKey(c)){
                    int idx = map.get(c);
                    map.put(c, Math.min(idx, j+1));
                } else {
                    map.put(c, j+1);
                }
            }
        }
        
        // 타겟과 비교
        for(int i=0; i<targets.length; i++){
            boolean flag = true;
            int count = 0;
            
            for(int j=0; j<targets[i].length(); j++){
                char c = targets[i].charAt(j);
                if(map.containsKey(c)){
                    count += map.get(c);
                } else {
                    flag = false;
                    break;
                }
            }
            
            answer[i] = flag ? count : -1;
        }
        
        
        return answer;
    }
}