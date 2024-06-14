class Solution {
    public int solution(int[][] sizes) {
        int v_max = 0;
        int h_max = 0;
        
        for(int i=0; i<sizes.length; i++){
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            
            v_max = Math.max(v_max, max);
            h_max = Math.max(h_max, min);
        }
        
        return v_max * h_max;
    }
}