/**
* 1. 최소입력값을 담은 map 생성 o
* 1.1 중복되는 경우, 더 작은 입력값 처리 o
* 2. target 단어의 최소 입력 값 처리
* 2.1 target 단어가 map에 없는 경우 처리
*/

import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> keypad = new HashMap<>();
        
        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){
                char c = keymap[i].charAt(j);
                
                // 더 작은 값 대체
                if(keypad.containsKey(c)){
                    if(keypad.get(c) > j+1){
                        keypad.put(c, j+1);
                    }
                    continue;
                }
                keypad.put(c, j+1);
            }
        }
        
        for(int i=0; i<targets.length; i++){
            for(int j=0; j<targets[i].length(); j++){
                char c = targets[i].charAt(j);
                
                if(!keypad.containsKey(c)){
                    answer[i] = -1;
                    break;
                }
                
                answer[i] += keypad.get(c);
            }
        }
        
        return answer;
    }
}