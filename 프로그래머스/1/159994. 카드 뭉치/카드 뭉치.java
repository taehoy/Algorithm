import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        // 큐를 만든다.
        Queue<String> gQueue = new LinkedList<>();
        Queue<String> c1Queue = new LinkedList<>();
        Queue<String> c2Queue = new LinkedList<>();
        
        // 큐에 값 넣자.
        for(String s : goal){
            gQueue.add(s);
        }  
        for(String s : cards1){
            c1Queue.add(s);
        }
        for(String s : cards2){
            c2Queue.add(s);
        }
        
        // goal이 빌떄까지 loop
        while(!gQueue.isEmpty()){
            // goal에서 하나 꺼냄
            String s = gQueue.poll();
        
            // 꺼낸 값이 두 큐에서 꺼낸 값과 일치한지 확인
            if(s.equals(c1Queue.peek())) c1Queue.poll();
            else if(s.equals(c2Queue.peek())) c2Queue.poll();
            else return "No";
        }
        
        return "Yes";
    }
}