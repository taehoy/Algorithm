import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int index = 0;
        int n = citations.length;

        Arrays.sort(citations);
         if(citations[n-1] == 0){
            return 0;
        }
        
        
        for(int i = n-1; i>=0; i--){
            if(citations[i] <= index) break;
            index++;
        }
        
        return index;
    }
}