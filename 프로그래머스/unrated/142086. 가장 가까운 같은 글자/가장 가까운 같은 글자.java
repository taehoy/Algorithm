import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
             // 없으면 -1
            if(!map.containsKey(s.charAt(i))){
                result[i] = -1;
                map.put(s.charAt(i), i);
            } else {
                // 있으면 현재 인덱스 -이전 인덱스
                result[i] = i - map.get(s.charAt(i));
                map.put(s.charAt(i), i);
            }
        }
        
        return result;
    }
}