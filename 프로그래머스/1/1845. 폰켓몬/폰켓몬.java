import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int pick = nums.length / 2;
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);    
        }
        System.out.println("size : " + set.size());
        
        if(set.size() >= pick) return pick;
        else return set.size();
        
    }
}