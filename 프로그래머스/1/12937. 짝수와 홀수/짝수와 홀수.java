class Solution {
    public String solution(int num) {
        return evenOrOdd(num);
    }
    
    public String evenOrOdd(int num){
        return (num % 2 ==0) ? "Even" : "Odd";
    }
}