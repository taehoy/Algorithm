import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int sum = (9-0+1) * (9+0) / 2; // 전체 합
        
        int numbersSum = Arrays.stream(numbers).sum();
        return sum - numbersSum;
    }
}