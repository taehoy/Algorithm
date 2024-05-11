import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            char currChar = c;
            int count = 0;
            
            while(count != index){
                currChar = currChar== 'z' ? 'a' : (char)(currChar +1);

                if(!skip.contains(String.valueOf(currChar))){
                    count++;
                }
            }
            
            sb.append(currChar);
        }
        
        return sb.toString();
    }
}