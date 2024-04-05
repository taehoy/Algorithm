import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<answer.length; i++){
            int firstNum = commands[i][0]; // 첫번쨰 자르는 수 
            int lastNum = commands[i][1]; // j번쩨 자르는 수 
            int[] temp = new int[lastNum - firstNum +1]; // 자른 배열 넣기

            for(int j=0; j<temp.length; j++){
                temp[j] = array[firstNum-1+j];
            }
            
            Arrays.sort(temp); // 자른 배열 정렬하기
            
            answer[i] = temp[commands[i][2]-1]; // k번째 배열 찾기
        }
        return answer;
    }
}