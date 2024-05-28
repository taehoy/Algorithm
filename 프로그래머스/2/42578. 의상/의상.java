import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] cloth : clothes){
            map.put(cloth[1], map.getOrDefault(cloth[1],0)+1);
        }
        
        for(Integer n : map.values()){
            answer *= (n+1);
        }
        
        return answer-1;
    }
}