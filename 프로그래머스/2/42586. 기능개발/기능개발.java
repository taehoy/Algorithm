import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        
        // 남은 작업일 수 계산
        int[] days = new int[progresses.length];
        
        // 큐에 넣기
        for(int i=0; i<progresses.length; i++){
            if((100-progresses[i])%speeds[i] == 0){
                days[i] = (100-progresses[i]) / speeds[i];
            } else if(100-progresses[i] % speeds[i] != 0){
                days[i] = (100-progresses[i]) / speeds[i] + 1;
            }
            q.add(days[i]); 
        }
        
        // 배포 단위 나누기
        int count = 0;
        int before = q.peek();
        List<Integer> list = new ArrayList<>();
        
        while(!q.isEmpty()){
            if(before >= q.peek()){
                q.poll();
                count++;
            } else {
                list.add(count);
                before = q.poll();
                count = 1;
            }
        }
        
        list.add(count);
        
        // 배열 만들기
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}