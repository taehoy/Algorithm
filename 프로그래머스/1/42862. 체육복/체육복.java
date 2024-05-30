import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // 여분, 도난 리스트 생성
        Set<Integer> reserveSet = new HashSet<>();
        Set<Integer> lostSet = new HashSet<>();
        
        for(int num : reserve){
            reserveSet.add(num);
        }
        
        for(int num : lost){
            if(reserveSet.contains(num)){
                reserveSet.remove(num);
                continue;
            }
            lostSet.add(num);
        }
        
        // 여분 있는 사람 중 도난 당한 사람 빌려주기
        for(int num : reserveSet){
            if(lostSet.contains(num-1)) lostSet.remove(num-1);
            else if(lostSet.contains(num+1)) lostSet.remove(num+1);
        }
        
        // 수업 참여인원 세기
        return n-lostSet.size();
    }
}