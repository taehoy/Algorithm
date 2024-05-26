import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
        for(int i=0; i<100000; i++){
            for(int j=1; j<100000;j++){
            }
        }
        return answer;
    }
}