class Solution {
    public int solution(int n, int k) {
        int i = n / 10;
        int answer = (12000 * n) + (2000 * k) - i * 2000;
        return answer;
    }
}