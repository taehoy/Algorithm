import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        // 우선 순위 힙
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        // 섞은 횟수 변수
        int count = 0;
        
        // 스코빌 힙 만들기
        for(int i : scoville){
            q.offer(i);
        }
        
        // 스코빌 지수 계산
            // 힙 길이가 1이될떄까지. -> 섞은 스코빌지수가 k보다 같거나 커지면 종료
        while(!q.isEmpty()){
            int current = q.poll();
            
            if(current < K){
                if(q.size() == 0){
                    return -1;
                }
                
                int next = q.poll();
                int sum = current + next * 2;
                q.offer(sum);
                count++;
            }
            
        }
        
        return count;
    }
}