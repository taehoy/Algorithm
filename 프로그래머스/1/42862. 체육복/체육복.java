import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        for(int num : reserve){
            reserveSet.add(num);
        }
        
        for(int num: lost){
            if(reserveSet.contains(num)){
                reserveSet.remove(num);
            } else{
                lostSet.add(num);
            }
        }
        
        for(int num : reserveSet){
            if(lostSet.contains(num-1)){
                lostSet.remove(num-1);
            } else if(lostSet.contains(num+1)){
                lostSet.remove(num+1);
            }
        }
        
        return n-lostSet.size();
    }
}