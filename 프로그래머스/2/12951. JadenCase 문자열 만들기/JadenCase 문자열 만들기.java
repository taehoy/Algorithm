class Solution {
    public String solution(String s) {
        String answer = "";
        // 2." "로 나누어준다.
        String[] strArr = s.split(" ");
    
        for(int i =0; i<strArr.length; i++){
            if(strArr[i].length() == 0) {
                answer += " ";
            } else {
                // 3 공백 포함 x -> 3.1첫 문자 대문자 변환 후 추가
                answer += strArr[i].substring(0,1).toUpperCase();
                // 3 공백 포함 x -> 3.2 나머지 소문자 추가
                answer += strArr[i].substring(1,strArr[i].length()).toLowerCase();
                // 3 공백 포함 x -> 3.3 공백 추가
                answer += " ";
            }
        }
        
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }
        // 4 마지막 공백 제거
        answer.substring(0,answer.length()-1);
        
        return answer.substring(0,answer.length()-1);
    }
}