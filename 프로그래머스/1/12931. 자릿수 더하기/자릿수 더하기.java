public class Solution {
    public int solution(int n) {
        // 각 자리수 구하기
        int sum = 0;
        String str = String.valueOf(n);
        String[] arr = str.split("");
        for(int i=0; i<arr.length; i++){
            sum += Integer.parseInt(arr[i]); // 합하기
        }
        
        return sum;
        
    }
}