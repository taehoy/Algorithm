/*
*   1.이름 별 점수 매핑하기 - map 
*   2.사진 속 이름별 점수 구하기
*   2.1 사진 속 이름이 없는 경우 처리 - 0점 더하기
*
*/
import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        // 맵 만들기 <이름, 점수>
        Map<String, Integer> scoreMap = new HashMap<>();
        
        for(int i=0; i<name.length; i++){
            scoreMap.put(name[i], yearning[i]);
        }
        
        int idx = 0;
        // 사진 속 이름별 점수 구하기
        for(String[] photos : photo){
            int tempScore = 0;
            for(String nameInPhoto : photos){
                // 존재하지 않는 경우
                tempScore += scoreMap.getOrDefault(nameInPhoto, 0);
            }
            
            answer[idx++] = tempScore;
        }
        
        return answer;
    }
}