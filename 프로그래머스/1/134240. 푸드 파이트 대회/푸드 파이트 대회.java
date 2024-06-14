import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        int n = 1;
        for(int i=1; i<food.length; i++){
            int times = food[i]/2;
            
            for(int j=0; j<times; j++){
                sb.append(n);
            }
            n++;
        }
        
        String s = sb + "0";
        s += sb.reverse();

        return s;
    }
}