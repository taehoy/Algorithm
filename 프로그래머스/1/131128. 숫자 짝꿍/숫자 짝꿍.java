class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        
        for(int i=0; i<X.length(); i++){
            arrX[X.charAt(i)-'0']++;
        }
        
        for(int i=0; i<Y.length(); i++){
            arrY[Y.charAt(i)-'0']++;
        }
        
        for(int i=9; i>=0; i--){
            while(arrX[i] >=1 && arrY[i] >= 1){
                sb.append(String.valueOf(i));
                arrX[i]--;
                arrY[i]--;
            }
        }
        
        if(sb.length() == 0) return "-1";
        if(sb.toString().charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}