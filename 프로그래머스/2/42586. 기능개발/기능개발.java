import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        
        // 남은 일수 구한다.
        for(int i=0; i<progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] == 0){
                q.offer((100 - progresses[i]) / speeds[i]);
                continue;
            }
            q.offer((100 - progresses[i]) / speeds[i] +1);
            
        }
        
        int before = q.poll(); // 이전 일수 
        int cnt = 1;
        List<Integer> list = new ArrayList<>();
        
        // 남은 일수 비교
        while(!q.isEmpty()){
            // 함께 배포
            if(before >= q.peek()){
                q.poll();
                cnt++;
            } else { // 따로 배포
                list.add(cnt);
                cnt = 1;
                before = q.poll();
            }
        }
        
        // 마지막 배포
        list.add(cnt);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}