import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int index = 0;
        int size = citations.length; // 배열 길이
        
        Arrays.sort(citations);
        
        // 0회
        if(citations[size-1] == 0) return 0;
        
        for(int i = size-1; i>=0; i--){
            if(index >= citations[i]) break;
            index++;
        }
        
        return index;
    }
}