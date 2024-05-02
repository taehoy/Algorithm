import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 도난, 여분 Set 만들기
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        // 도난 Set 값 넣기
        for(int i : reserve){
            reserveSet.add(i);
        }
        
        // 여분이 있는 사람 중 도난 당한 사람 처리
        for(int i : lost){
            if(reserveSet.contains(i)){
                reserveSet.remove(i);
            } else{
                lostSet.add(i);
            }
        }
        
        // 여분 있는 사람이 도난 당한 사람 돕는 경우
        for(Integer i : reserveSet){
            if(lostSet.contains(i-1)){
                lostSet.remove(i-1);
            } else if(lostSet.contains(i+1)){
                lostSet.remove(i+1);
            }
        }
        
        return n-lostSet.size();
    }
}