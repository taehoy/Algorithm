class Solution {
    public int solution(int[][] sizes) {
        int max_v = 0; // 가로길이
        int max_h = 0; // 세로길이
        
        for(int[] card : sizes){
            max_v = Math.max(max_v, Math.max(card[0],card[1]));
            max_h = Math.max(max_h, Math.min(card[0],card[1]));
        }
        
        return max_v * max_h;
    }
}