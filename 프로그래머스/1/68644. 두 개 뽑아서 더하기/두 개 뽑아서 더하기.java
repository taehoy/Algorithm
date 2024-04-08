import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                String temp = Integer.toString(numbers[i]+numbers[j]);
                if(!list.contains(temp)){
                    list.add(temp);
                    System.out.printf("%d + %d = %s\n", numbers[i], numbers[j], temp);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = Integer.parseInt(list.get(i));
        }
        Arrays.sort(answer);
        return answer;
    }
}