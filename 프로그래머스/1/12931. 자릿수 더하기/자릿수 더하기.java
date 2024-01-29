import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String string = String.valueOf(n);
        String[] strings = string.split("");
        
        for(String s : strings) {
            int i = Integer.parseInt(s);
            answer += i;
        }
        return answer;
    }
}