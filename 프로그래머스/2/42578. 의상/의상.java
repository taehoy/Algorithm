import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] cloth : clothes){
            map.put(cloth[1], map.getOrDefault(cloth[1],0) +1);
        }
        
        System.out.println(map);
        
        // 없는거까지 포함해서 개수 경우의 수 계산
        for(int num : map.values()){
            answer *= (num+1);
        }
        
        return answer-1;
    }
}