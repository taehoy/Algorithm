import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        int n = citations.length;
        
        if(citations[n-1] == 0){
            return 0;
        }
        
        
        int idx = 0;
        for(int i=n-1; i>=0; i--){
            if(idx >= citations[i]) break;
            idx++;
        }
        
        return idx;
    }
}