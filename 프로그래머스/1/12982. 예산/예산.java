import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        // 오름차순 정렬
        Arrays.sort(d);
        
        // 인덱스 0부터 더한다. sum > budget 이면 중단 
        for(int i=0; i<d.length; i++){
            sum += d[i];
            if(sum > budget){
                break;
            }
            answer = i+1;
        }
        
        return answer;
    }
}