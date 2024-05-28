import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        
        int index =1; // 사전 색인번호
        String input =""; // 입력값
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        
        // 1. 맵 만들기
        Map<String, Integer> map = new HashMap<>();
        
        for(String s : alphabet){
            map.put(s, index++);
        }
        
        // 2.알고리즘 시작
        for(int i=0; i<msg.length(); i++){
            input += msg.substring(i,i+1);
            
            // 2.1 입력이 사전에 존재할 경우
            if(map.containsKey(input)){
                if(i+1 == msg.length()){
                    list.add(map.get(input));
                    break;
                }
                continue;
            } else{
            // 2.2 입력이 사전에 존재하지 않을 경우
                int idx = map.get(input.substring(0, input.length()-1)); // 출력할 색인번호
                list.add(idx);
                
                // 입력값 사전에 등록
                map.put(input, index++);
                // 앞의 문자 제거
                input = input.substring(input.length()-1, input.length());
                
                if(i+1 == msg.length()){
                    list.add(map.get(input));
                    break;
                }
            }
        }
        
        // 리스트-> 배열
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}