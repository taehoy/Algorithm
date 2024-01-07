class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        int length = my_string.length();
        String[] strArr = my_string.split("");

        for(int i=0; i<length/2; i++) {
            String temp = strArr[i];
            strArr[i] = strArr[length-1-i];
            strArr[length-1-i] = temp;
        }

        for(int i=0; i<length; i++) {
            answer += strArr[i];
        }
        
        return answer;
    }
}