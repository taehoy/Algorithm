class Solution {
    public int solution(int[][] sizes) {
        int v_max = 0;
        int h_max = 0;
        
        for(int[] card : sizes){
            v_max = Math.max(v_max, Math.max(card[0], card[1]));
            h_max = Math.max(h_max, Math.min(card[0], card[1]));
        }
        
        return v_max * h_max;
    }
}