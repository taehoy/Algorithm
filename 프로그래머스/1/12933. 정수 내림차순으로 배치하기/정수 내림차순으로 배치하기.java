class Solution {
    public long solution(long n) {
        String answer = "";
        // 문자열로 변환
        String strN = Long.toString(n);
        // 정수 배열 만들기
        int[] arrIntN = new int[strN.length()];
        
        for(int i=0; i<strN.length(); i++){
            String temp = strN.substring(i, i+1);
            arrIntN[i] = Integer.parseInt(temp);
        }
        
        // 내림차순 만들기
        for(int i=0; i<arrIntN.length-1; i++){
            for(int j=0; j<arrIntN.length-1; j++){
                if(arrIntN[j] < arrIntN[j+1]) {
                    int temp = arrIntN[j];
                    arrIntN[j] = arrIntN[j+1];
                    arrIntN[j+1] = temp;
                }
            }
        }
        // answer 값 얻기 
        for(int i=0; i<strN.length(); i++){
            answer += arrIntN[i];
        }
        return Long.parseLong(answer);
    }
}