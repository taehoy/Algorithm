class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int col=3; col<=5000; col++){
            for(int row=3; row<=col; row++){
                int boundary = (col+row -2) *2;
                int center = col*row - boundary;
                
                if(boundary == brown && center == yellow){
                    answer[0] = col;
                    answer[1] = row;
                    
                    return answer;
                }
            }
        }
        
        return answer;
    }
}