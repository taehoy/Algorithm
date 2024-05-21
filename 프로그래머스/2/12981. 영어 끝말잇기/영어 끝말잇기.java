/*
*   1. 틀린 경우 처리
*   1.1 중복 여부 확인
*   1.2 중복 x - > 앞뒤 같은지 확인
*   1.3 틀리면 멈춤
*   2. 틀린 것 없으면 [0,0] 리턴
*   3. 틀린 것 있으면 인덱스 이용하여 처리
*
*/
import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        Set<String> wordSet = new HashSet<>();
        int wrongIdx = 0; // 틀린 단어 인덱스
        
        String first = words[0];
        wordSet.add(first);
        
        for(int i=1; i<words.length; i++){
            // 중복인 경우
            if(wordSet.contains(words[i])){
                wrongIdx = i;
                break;
            }
            else {  // 중복이 아닌 경우
                wordSet.add(words[i]);
                // 앞의 마지막 글자와 다른경우
                if(!words[i].substring(0,1).equals(words[i-1].substring(words[i-1].length()-1,words[i-1].length()))){
                    wrongIdx = i;
                    break;
                }
            } 
        }
        
        if(wrongIdx == 0) {
            answer[0] = 0;
            answer[1] = 0;
            return answer;
        }
        
        // // 틀린 사람 번호, 몇번째 구하기
        answer[0] = wrongIdx % n +1;
        answer[1] = wrongIdx / n +1;
        
        return answer;
    }
}