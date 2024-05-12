import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        // 큐 생성
        Queue<String> que1 = new LinkedList<>();
        Queue<String> que2 = new LinkedList<>();
        Queue<String> que3 = new LinkedList<>();
        
        // 큐에 추가
        for(String s : cards1) que1.offer(s);
        for(String s : cards2) que2.offer(s);
        for(String s : goal) que3.offer(s);
        
        // 목표 단어 생성 여부 처리
        while(!que3.isEmpty()){
            String s = que3.poll();    
            String s1 = que1.peek();
            String s2 = que2.peek();
        
            if(s.equals(s1)) que1.poll();
            else if(s.equals(s2)) que2.poll();
            else return "No";
        }
        
        return "Yes";
    }
}