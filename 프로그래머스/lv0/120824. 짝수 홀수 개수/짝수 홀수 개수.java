class Solution {
    public int[] solution(int[] num_list) {
        int count1 = 0;
        int count2 = 0;
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 ==0) {
                count2 ++;
            } else 
                count1 ++;
        }
        
        int[] answer = new int[2];
        answer[0] = count2;
        answer[1] = count1;
        return answer;
    }
}