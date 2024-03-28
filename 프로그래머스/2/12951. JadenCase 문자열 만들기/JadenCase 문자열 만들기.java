class Solution {
    public String solution(String s) {
        String answer = "";
        // 전체를 소문자화하여 공백일 경우 대문자로 변환한다.
        // 2. 배열만들기
        String[] arr = s.toLowerCase().split("");
        // 3. boolean값 flag을 이용하여 대문자화하기
        boolean flag = true;
     
        for(String ss : arr){
            answer += flag ? ss.toUpperCase() : ss;  // 3.1 flag이 true면 대문자, 아니면 그대로 넣기
            flag = ss.equals(" ") ? true : false; // 3.2 공백이면 다음 값 대문자하기
        }
        return answer;
    }
}