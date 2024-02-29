class Solution {
    public long[] solution(long x, int n) {
        // x, 2x, 3x, 4x, 5x ,,, nx;
        long[] answer = new long[n];
        for(int i=0; i<n; i++){
            answer[i] = x * (i+1);
        }
        return answer;
    }
}