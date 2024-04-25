import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        // 최저점수 배열 생성 길이 : score.length
        int[] answer = new int[score.length];
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<score.length; i++){
            list.add(score[i]);
            
            if(list.size() > k){
                list.remove(Collections.min(list));
            }
            
            answer[i] = Collections.min(list);
        }
        return answer;
    }
}