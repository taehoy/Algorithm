class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 점수 카운트
        int max = 0;
        int min = 0;
        
        for(int i : lottos){
            if(i == 0 ){
                max++;
            } else {
                for(int j : win_nums){
                    if(i == j) {
                        max++;
                        min++;
                    }
                }
            }
        }
        
        return new int[]{Math.min(7-max, 6), Math.min(7-min, 6)};
    }
}