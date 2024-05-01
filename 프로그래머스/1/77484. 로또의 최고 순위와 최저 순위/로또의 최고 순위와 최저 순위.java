import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        // 자료 준비
        int max = 0;
        int min = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : win_nums){
            map.put(num, 1);
        }
        
        // 최고개수, 최저 개수 구하기
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                max++;
            } else {
                if(map.containsKey(lottos[i])){
                    max++;
                    min++;
                }
            }
        }
        
        // 점수에 따른 순위 매기기
        switch(max){
            case 6 : 
                answer[0] = 1;
                break;
            case 5 : 
                answer[0] = 2;
                break;
            case 4 : 
                answer[0] = 3;
                break;
            case 3 : 
                answer[0] = 4;
                break;
            case 2 : 
                answer[0] = 5;
                break;
            default : 
                answer[0] = 6;
                break;
        }
        
        switch(min){
            case 6 : 
                answer[1] = 1;
                break;
            case 5 : 
                answer[1] = 2;
                break;
            case 4 : 
                answer[1] = 3;
                break;
            case 3 : 
                answer[1] = 4;
                break;
            case 2 : 
                answer[1] = 5;
                break;
            default : 
                answer[1] = 6;
                break;
        }
    
        return answer;
    }
}