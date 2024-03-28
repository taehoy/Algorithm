class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        
        int idx = 0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].equals(" ")){
                idx = 0;
            } else if(idx % 2 == 0){
                strArr[i] = strArr[i].toUpperCase();
                idx++;
            } else if(idx % 2 == 1){
                strArr[i] = strArr[i].toLowerCase();
                idx++;
            }
            answer += strArr[i];
        }
        
        return answer;
        
    }
}