import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[] scores = new int[3];
        // 수포자 3인방 배열 만들기
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 배열에 맞는 정답 수 구하기
        for(int i=0; i<answers.length; i++){
            if(answers[i] == one[i%5]) scores[0]++;
            if(answers[i] == two[i%8]) scores[1]++;
            if(answers[i] == three[i%10]) scores[2]++;
        }
        
        // 정답 수 비교
        int MaxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        // 리턴할 리스트 만들기 -> 여럿일 경우, 모두 출력해야하기 때문
        List<Integer> list = new ArrayList<>();
        
        // 최대 점수에 해당하는 수포자 넣기
        for(int i=0; i<3; i++){
            if(scores[i] == MaxScore) list.add(i+1);
        }
        
        return list;
    }
}