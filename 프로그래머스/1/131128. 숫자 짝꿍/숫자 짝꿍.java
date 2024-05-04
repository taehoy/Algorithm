class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        // 배열 만들기
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        
        // 각 숫자 배열에 값 넣기
        for(int i = 0; i<X.length(); i++){
            arrX[X.charAt(i)-'0']++;
        }
        for(int i = 0; i<Y.length(); i++){
            arrY[Y.charAt(i)-'0']++;
        }
        
        // 함께 있는 수 구하기
        for(int i=9; i>=0; i--){
            while(arrX[i] >= 1 && arrY[i] >= 1){
                sb.append(String.valueOf(i));
                arrX[i]--;
                arrY[i]--;
            }
        }
        
        // 없으면 -1
        if(sb.length() == 0) return "-1";
        
        // 0이면 0
        if(sb.toString().charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}