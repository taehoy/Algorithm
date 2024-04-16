class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int carpet = brown + yellow;
        
        for(int i=3; i<=carpet; i++){
            int row = i;
            int col = carpet / row;
            
            if(col < 3) continue;
            
            if(col >= row){
                int center = (col-2) * (row-2);
                if(center == yellow){
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}