class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(s.length() > 1){
            int length = 0; // 0을 제거한 문자열의 길이
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0') answer[1]++;
                else length++;
            }            
            
            s = Integer.toBinaryString(length);
            answer[0]++;
        }
        
        return answer;
    }
}