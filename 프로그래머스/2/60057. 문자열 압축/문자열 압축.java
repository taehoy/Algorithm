import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        for(int i=1; i<=s.length()/2; i++){
            StringBuilder sb = new StringBuilder();
            
            int zipLength = 1;
            String zipStr = s.substring(0,i);
            
            for(int j=i; j<=s.length(); j+=i){
                String nextStr = s.substring(j, (j+i > s.length()) ? s.length() : j+i);
                
                if(zipStr.equals(nextStr)) zipLength++;
                else {
                    sb.append((zipLength != 1 ? zipLength : "") + zipStr);
                    zipStr = nextStr;
                    zipLength =1;
                }
            }
            
            sb.append(zipStr);
            
            answer = Math.min(answer, sb.length());
        }
        
        return answer;
    }
}