import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 해시 셋 만들기
        HashSet<Integer> set = new HashSet<>();
        
        // 해시 셋에 nums값 넣기
        for(int num : nums){
            set.add(num);
        }
        
        // 셋 size와 nums/2 비교하기
        if(set.size() >= nums.length/2) answer = nums.length/2;
        else answer = set.size();
        
        return answer;
    }
}