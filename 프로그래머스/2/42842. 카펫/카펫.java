class Solution {
    public int[] solution(int brown, int yellow) {
        // 가로 세로 
        for(int col = 3; col <= 5000; col++){
            for(int row = 3; row <=col; row++){
                int boundary = (col + row -2) * 2;
                int center = (col * row) - boundary;
                
                if(boundary == brown && center == yellow){
                    return new int[]{col, row};
                }
            }
        }
        
        return null;
    }
}