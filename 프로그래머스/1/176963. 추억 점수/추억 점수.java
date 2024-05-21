/*
*   1.이름 별 점수 매핑하기 - map 
*   2.사진 속 이름별 점수 구하기
*   2.1 사진 속 이름이 없는 경우 처리 - 0점 더하기
*
*
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
        
        // 사진 속 이름별 점수 구하기
        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                String nameInPhoto = photo[i][j];
                // 존재하지 않는 경우
                if(!scoreMap.containsKey(nameInPhoto)){
                    answer[i] +=0;
                    continue;
                }
                // 존재할 경우
                answer[i] += scoreMap.get(nameInPhoto);
            }
        }
        
        return answer;
    }
}