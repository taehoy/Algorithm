class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        
        while(s.length() > 1){
            int size = 0;
            
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0'){ // 0일때 
                    answer[1]++;
                } else { // 1일때
                    size++;
                }
            }
            
            s = Integer.toBinaryString(size);
            answer[0]++;
        }
        
        return answer;
    }
}