class Solution {
    public int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        
        int result1 = Integer.parseInt(strA + strB);
        int result2 = Integer.parseInt(strB + strA);
        
        int answer = 0;
        if(result1 >= result2) {
        	answer = result1;
        } else
        	answer = result2;
        return answer;
    }
}