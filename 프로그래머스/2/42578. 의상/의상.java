/*
*   1. 타입별 옷 개수 구하기
*   2. 옷 개수에 따라 조합 수 계산
*   3. 아무것도 안입은 경우 제외
*
*/

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        // 종류별 옷 개수 처리
        for(String[] cloth : clothes){
            map.put(cloth[1], map.getOrDefault(cloth[1], 0)+1); 
        }
        
        // 옷 개수에 따른 모든 조합 수 계산
        for(Integer value : map.values()){
            answer *= (value+1); // 안입은 경우도 포함 : +1
        }
        
        // 전부 안입은 경우 처리
        return answer-1;
    }
}