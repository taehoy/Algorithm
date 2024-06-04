class Solution {
    public int solution(String dartResult) {
        int idx = -1;
        int[] scores = new int[3];
        
        for(int i=0; i<dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if(Character.isDigit(c)){
                idx++;
                
                if(dartResult.charAt(i+1) == '0'){
                    i++;
                    scores[idx] = 10;
                    continue;
                }
                
                scores[idx] = Integer.parseInt(String.valueOf(c));
            }
            
            if(c == 'D') scores[idx] = (int)Math.pow(scores[idx], 2);
            else if(c == 'T') scores[idx] = (int)Math.pow(scores[idx], 3);
            else if(c == '*'){
                scores[idx] *= 2;
                if(idx -1 >=0){
                    scores[idx-1] *= 2;
                }
            }
            else if(c == '#') scores[idx] *= -1;
        }
        
        
        
        return scores[0] + scores[1] + scores[2];
    }
}