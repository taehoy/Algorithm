import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<food.length; i++){
            int temp = food[i] / 2;
            for(int j=0; j<temp; j++){
                sb.append(i);
            }
        }
        
        String answer = sb + "0";
        
        answer += sb.reverse();
        
        return answer;
    }
}