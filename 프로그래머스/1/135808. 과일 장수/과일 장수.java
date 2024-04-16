import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        for(int index = score.length-m; index>=0; index-=m){
            answer += score[index] * m;
        }
        
        return answer;
    }
}