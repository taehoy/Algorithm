class Solution {
    public double solution(int[] arr) {
        int sum =0;
        //합 구하기
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        
        // 평균 구하기 - 합 / 길이
        return (double)sum / arr.length;
        
    }
}