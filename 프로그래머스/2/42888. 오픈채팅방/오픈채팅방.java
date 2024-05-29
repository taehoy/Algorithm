import java.util.*;
import java.io.*;

class Solution {
    public String[] solution(String[] record) throws IOException {
        // map<아이디, 닉네임>
        Map<String, String> map = new HashMap<>();
        String order = "";
        String userId = "";
        String nickname = "";
        String[] strings = {};
        
        for(int i=0; i<record.length; i++){
            strings = record[i].split(" "); // 입력 문장 나누기
            
            // 명령어
            order = strings[0];
            userId = strings[1];
            
            if(order.equals("Enter") || order.equals("Change")){
                nickname = strings[2];
                map.put(userId, nickname);
            } 
        }
        
        List<String> list = new ArrayList<>();
        
        // 출력
        for(int i=0; i<record.length; i++){
            strings = record[i].split(" "); // 입력 문장 나누기
            
            // 명령어
            order = strings[0];
            userId = strings[1];
            nickname = map.get(userId);
            
            if(order.equals("Enter")){
                list.add(nickname + "님이 들어왔습니다.");
            } else if(order.equals("Leave")){
                list.add(nickname + "님이 나갔습니다.");
            }
        }
        
        String[] answer = new String[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}