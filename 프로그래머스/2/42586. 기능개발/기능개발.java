import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] == 0){
                q.offer((100 - progresses[i]) / speeds[i]);
            } else {
                q.offer((100 - progresses[i]) / speeds[i] +1);
            }
        }
        
        int before = q.poll();
        int count =1;
        
        List<Integer> list = new ArrayList<>();
        
        while(!q.isEmpty()){
            if(before >= q.peek()){
                q.poll();
                count++;
            } else {
                list.add(count);
                count = 1;
                before = q.poll();
            }
        }
        
        list.add(count);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}