import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(!map.containsKey(c)){
                map.put(c,i);
                answer[i] = -1;
            } else {
                int idx = map.get(c);
                int diff = i - idx;
                answer[i] = diff;
                map.put(c,i);
            }
        }
        
        return answer;
    }
}