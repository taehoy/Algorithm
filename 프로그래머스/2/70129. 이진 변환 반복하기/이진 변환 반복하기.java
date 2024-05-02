class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        
        while(!s.equals("1")){
            int oneCount = 0;
            
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '1') {
                    oneCount++;
                }
            }
            
            answer[1] += s.length() - oneCount;
            
            s = Integer.toBinaryString(oneCount);
            answer[0]++;
        }
        
        return answer;
    }
}