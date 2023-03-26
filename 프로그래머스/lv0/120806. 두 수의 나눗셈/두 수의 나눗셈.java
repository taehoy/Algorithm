class Solution {
    public int solution(double num1, double num2) {
        double a = (num1 / num2) * 1000;
        int answer = (int)Math.floor(a);
        return answer;
    }
}