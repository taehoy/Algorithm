import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int pickNum = nums.length / 2;
        
        // 중복 제거
        HashSet<Integer> numsSet = new HashSet<>();
        
        for(int num : nums){
            numsSet.add(num);
        }
        
        // set의 크기가 pickNum보다 크거나 같으면 pickNum, 작으면 set의 크기 반환
        if(numsSet.size() >= pickNum){
            return pickNum;
        } else {
            return numsSet.size();
        }
    }
}