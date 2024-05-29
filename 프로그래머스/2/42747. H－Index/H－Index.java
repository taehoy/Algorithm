import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        int size = citations.length;
        
        if(citations[size-1] == 0){
            return 0;
        }
        
        int count = 0; // 인용된 논문 수
        
        for(int i=size-1; i>=0; i--){
            if(count >= citations[i]) break;
            count++;
             
        }
        
        return count;
    }
}