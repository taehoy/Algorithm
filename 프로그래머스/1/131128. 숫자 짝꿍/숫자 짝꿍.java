class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        // X와 Y의 숫자 배열
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        
        // X와 Y의 숫자 비교
        // X의 숫자 배열 값 대입
        for(int i=0; i<X.length(); i++){
            arrX[X.charAt(i) - '0']++;
        }
        
        // Y의 숫자 배열 값 대입
        for(int i=0; i<Y.length(); i++){
            arrY[Y.charAt(i) - '0']++;
        }
        
        for(int i=9; i>=0; i--){
            while(arrX[i]>=1 && arrY[i]>= 1){
                sb.append(String.valueOf(i));
                arrX[i]--;
                arrY[i]--;
            }
        }
        
        // 짝꿍이 없으면 -1반환
        if(sb.length() == 0) return "-1";
        
        // 짝꿍이 0으로만 구성되어있으면 0반환
        if(sb.toString().charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}