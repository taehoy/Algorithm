import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length]; // 발표 점수 배열 : answer
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
            // list에 추가한다.
            list.add(score[i]);
            
            // list의 길이가 k보다 크면, list의 가장 작은 수를 제거한다.
            if(list.size() > k){
                list.remove(Collections.min(list));
            }
            
            // list의 가장 작은 수를 answer에 넣는다.
            answer[i] = Collections.min(list);
        }
        return answer;
    }
}