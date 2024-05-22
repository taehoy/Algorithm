class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        // 최종좌표 초기화
        int lux = 100;
        int luy = 100;
        int rdx = 0;
        int rdy = 0;
        
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    // 현재 #의 좌표
                    int currLux = i;
                    int currLuy = j;
                    int currRdx = i+1;
                    int currRdy = j+1;
                    
                    // 크기 비교 처리(최종 좌표 재설정)
                    lux = Math.min(lux, currLux);
                    luy = Math.min(luy, currLuy);
                    rdx = Math.max(rdx, currRdx);
                    rdy = Math.max(rdy, currRdy);
                }
            }
        }
        
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx;
        answer[3] = rdy;
        
        return answer;
    }
}