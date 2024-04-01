class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] arr = s.split("");
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(" ")){
                answer += " ";
            } else if(65 <= arr[i].charAt(0) && arr[i].charAt(0) <= 90){
                int sumCh = (int)arr[i].charAt(0) + n; // n을 추가한다.
                if(90 < sumCh){ // 만약 n을 추가했을 때 90을 넘기면 - 26을 한다.
                    sumCh = sumCh - 26;
                }    
                char ch = (char)sumCh;// sumCh char 변환
                answer += ch;
            } else {
                int sumCh = (int)arr[i].charAt(0) + n; // n을 추가한다.
                if(122 < sumCh){ // 만약 n을 추가했을 때 90을 넘기면 - 26을 한다.
                    sumCh = sumCh - 26;
                }    
                char ch = (char)sumCh;// sumCh char 변환
                answer += ch;
            }
        }
        
        
        
        return answer;
    }
}