class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sumOfNumbers = 0;
        double j = (double)numbers.length;
        for (int i=0; i<numbers.length; i++) {
            sumOfNumbers += numbers[i];
        }
        answer = sumOfNumbers / j;
        return answer;
    }
}