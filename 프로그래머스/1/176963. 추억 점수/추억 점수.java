import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        // 맵 생성
        Map<String, Integer> map = new HashMap<>();
        
        // 맵에 이름, 점수 담기
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        // 사진에 있는 이름에 맞춰 점수 추가하기
        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                answer[i] += map.getOrDefault(photo[i][j], 0);
            }
        }
        
        return answer;
    }
}