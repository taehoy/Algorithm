class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] arr = {};
        arr = phone_number.split("");
        
        if(arr.length == 4) {
            return phone_number;
        } else {
            // 배열 길이 - 4만큼 * 변환 
            for(int i =0; i<arr.length -4; i++){
                arr[i] = "*";
            }
        }
        
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}