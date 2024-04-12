import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // 임시 배열에 자른것 만큼 넣는다. loop 이용
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            // 임시 배열에 넣기
            int[] temp = new int[end-start+1];
            for(int j = start-1 ; j<end; j++){
                temp[j-start+1] = array[j];
            }
            // 임시 배열 정렬
            Arrays.sort(temp);
            
            for(int num : temp){
                System.out.print(num);
            }
            System.out.println();
            // temp 배열의 특정 인덱스 값 -> answer
            // answer[i] = temp[commands[i][2]];
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}