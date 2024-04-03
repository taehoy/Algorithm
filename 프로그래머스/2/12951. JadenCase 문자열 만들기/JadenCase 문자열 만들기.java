class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split("");
        boolean flag = true;
        
        for(String ss : arr){
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }
        
        return answer;
    }
}