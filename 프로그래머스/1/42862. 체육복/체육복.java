import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // 도난 set, 여분 set 생성
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        // 여분 set 데이터 추가
        for(int i : reserve){
            reserveSet.add(i);
        }
        
        for(int i : lost){
            if(reserveSet.contains(i)){
                reserveSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }
        
        for(Integer i : reserveSet){
            if(lostSet.contains(i-1)){
                lostSet.remove(i-1);
            } else if (lostSet.contains(i+1)){
                lostSet.remove(i+1);
            }
        }
        
        return n - lostSet.size();
    }
}