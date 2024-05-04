import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        
        int max = 0;
        int min = 0;
        
        // Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        // 맵에 당첨번호 넣기
        for(int i : win_nums){
            list.add(i);
        }
        
        // 당첨번호와 매칭
        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0){
                max++;
            } else {
                if(list.contains(lottos[i])){
                    max++;
                    min++;
                }
            }
        }
        
        return new int[] {Math.min(7-max, 6), Math.min(7-min, 6)};
    }
}