import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        // skip 리스트 만들기
        char[] arr = skip.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char c : arr){
            list.add(c);
        }

        // 알파벳 변환
        
        for(int i=0; i<s.length(); i++){
            int count = 0; // 현재 변환횟수
            char c = s.charAt(i); // 현재 알파벳
            char currChar = c;
            
            // 정해진 횟수만큼 이동 시작
            while(count != index){
                // 한번 이동
                currChar = (char)(currChar + 1);
                
                // z를 넘을 경우 처리
                if(currChar > 'z'){
                    currChar = (char)(currChar - 26);
                }
                
                // // skip과 건너뛰기 유무 처리
                if(list.contains(currChar)){
                    continue;
                }
                
                // skip에 없으면 알파벳 한칸 이동
                count++;
            }
            
            sb.append(currChar);
        } // 변환 끝
        
        return sb.toString();
    }
}