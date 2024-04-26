import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        // 수포자 배열
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 수포자 점수 계산
        int[] scores = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == arr1[i%5]) scores[0]++;
            if(answers[i] == arr2[i%8]) scores[1]++;
            if(answers[i] == arr3[i%10]) scores[2]++;
        }
        
        // 최대 점수
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        // 수포자-점수 Map 만들기
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<3; i++){
            map.put(i+1, scores[i]);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<map.size(); i++){
            if(map.get(i+1) == max) list.add(i+1);
        }
        
        // 리스트 -> 배열
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}