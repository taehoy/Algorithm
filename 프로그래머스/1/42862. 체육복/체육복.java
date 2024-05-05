import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // 도난, 여분 번호 Set 생성
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        // 여분 Set 값 넣기
        for(int i : reserve){
            reserveSet.add(i);
        }
        
        // 도난 번호 값 넣기 - 도난 번호에 여분 번호 있으면 여분 번호 제거, 아니면 도난 번호 추가
        for(int i : lost){
            if(reserveSet.contains(i)){
                reserveSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }
        
        // 여분 번호가 도난 번호의 앞 뒤면 제거하기
        for(Integer i : reserveSet){
            if(lostSet.contains(i-1)){
                lostSet.remove(i-1);
            } else if(lostSet.contains(i+1)){
                lostSet.remove(i+1);
            }
        }
        
        return n - lostSet.size();
    }
}