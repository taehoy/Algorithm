import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0; // 프로세스 실행 수 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : priorities){
            pq.add(i);
        }
        
        // 배열와 큐의 우선순위 비교
        while(!pq.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == pq.peek()){
                    pq.poll();
                    answer++;
                    
                    if(i == location){
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}