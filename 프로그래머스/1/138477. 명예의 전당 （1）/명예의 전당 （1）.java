import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        // 최저점수 배열 생성 길이 : score.length
        int[] answer = new int[score.length];
        
        // 프리오리티 큐 생성(순서o)
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        

        // 큐에 값 넣기
        for(int i=0; i<score.length; i++){
            // 큐에 값 넣기
            queue.add(score[i]);
            
            // 큐의 크기가 k보다 크면 빼기
            if(queue.size() > k){
                queue.poll();
            }
            
            // 큐의 맨 앞의 값을 배열에 넣는다.
            answer[i] = queue.peek();
        }
        
        return answer;
    }
}