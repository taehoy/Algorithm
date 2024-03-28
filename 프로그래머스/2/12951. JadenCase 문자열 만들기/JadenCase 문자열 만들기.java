class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        
        for(int i=0; i<arr.length; i++){
            // 공백일 경우 공백추가
            if(arr[i].length() == 0){
                answer += " ";
            } else { // 공백이 아닐 경우 첫문자 대문자, 소문자, 공백추가
                answer += arr[i].substring(0,1).toUpperCase();
                answer += arr[i].substring(1,arr[i].length()).toLowerCase();
                answer += " ";
            }
        }
                    
        //원래 문자열의 마지막이 공백일 경우 그대로 출력
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }
        //원래 문자열의 마지막이 공백이 아닐 경우, 공백 제거후 출력 
        return answer.substring(0,answer.length()-1);
    }
}