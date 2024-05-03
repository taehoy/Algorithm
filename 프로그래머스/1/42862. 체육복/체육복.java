import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 도난, 여분 Set
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        // 여분 넣고
        for(int i : reserve){
            reserveSet.add(i);
        }
        
        // 여분 있는 사람 중 도난자 있으면 여분 뺌, 없으면 도난자 추가
        for(int i : lost){
            if(reserveSet.contains(i)){
                reserveSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }
        
        // 여분 있는 사람 앞 뒤에 도난 번호 처리
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