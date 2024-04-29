class Solution {
    public int solution(int[][] sizes) {
        int v_max = 0; // 가로
        int h_max = 0; // 세로
        
        // 명함 수만큼 반복
        for(int i=0; i<sizes.length; i++){
            // 길이가 긴 것을 가로로 세팅 후 최대값 구하기
            v_max = Math.max(v_max,Math.max(sizes[i][0], sizes[i][1]));
            // 길이가 짧은 것 세로
            h_max = Math.max(h_max,Math.min(sizes[i][0], sizes[i][1]));
        }
        
        // 명함 크기 반환(가로 * 세로)
        return v_max * h_max;
    }
}