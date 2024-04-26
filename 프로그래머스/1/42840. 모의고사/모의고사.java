import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[] answer = {};
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 각각 점수 변수
        int[] scores = new int[3];
        
        // 점수 매기기
        for(int i=0; i<answers.length; i++){
            if(arr1[i%5] == answers[i]) scores[0]++;
            if(arr2[i%8] == answers[i]) scores[1]++;
            if(arr3[i%10] == answers[i]) scores[2]++;
        }
        
        // 최대맞춘 수 구하기
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<scores.length; i++){
            if(scores[i] == max) {
                list.add(i+1);
            }
        }
        
        return list;
    }
}